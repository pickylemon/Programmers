-- 코드를 입력하세요

WITH RENTAL_HISTORY AS (
    SELECT HISTORY_ID, 
           CAR_ID,
           DATEDIFF(END_DATE, START_DATE) + 1 as DURATION
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY )


SELECT HISTORY_ID, 
       CASE 
       WHEN DURATION >= 90 
       THEN FLOOR((SELECT (1-(DISCOUNT_RATE/100)) 
                   FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                   WHERE DURATION_TYPE = '90일 이상'
                   AND CAR_TYPE = '트럭')
                   * DURATION * DAILY_FEE)
       WHEN DURATION >= 30
       THEN FLOOR((SELECT (1-(DISCOUNT_RATE/100)) 
                   FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                   WHERE DURATION_TYPE = '30일 이상'
                   AND CAR_TYPE = '트럭')
                   * DURATION * DAILY_FEE)
       WHEN DURATION >= 7
       THEN FLOOR((SELECT (1-(DISCOUNT_RATE/100)) 
                   FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                   WHERE DURATION_TYPE = '7일 이상'
                   AND CAR_TYPE = '트럭')
                   * DURATION * DAILY_FEE)   
       ELSE DURATION * DAILY_FEE END as FEE
FROM CAR_RENTAL_COMPANY_CAR a
INNER JOIN RENTAL_HISTORY b
ON a.CAR_ID = b.CAR_ID
WHERE a.CAR_TYPE = '트럭'
ORDER BY FEE DESC, HISTORY_ID DESC;
-- 1. HISTORY와 DISCOUNT 테이블을 join해야한다.
-- 근데 equi join이 아님