-- 코드를 입력하세요
SELECT CAR_ID, CAR_TYPE, FLOOR(FEE) FEE
FROM (
    SELECT a.CAR_ID, a.CAR_TYPE, 
           a.DAILY_FEE*(100-c.DISCOUNT_RATE)*30/100 FEE        
    FROM CAR_RENTAL_COMPANY_CAR a
    INNER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN c
    ON a.CAR_TYPE = c.CAR_TYPE
    WHERE a.CAR_ID NOT IN (SELECT CAR_ID
                           FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                           WHERE '2022-11' BETWEEN DATE_FORMAT(START_DATE,'%Y-%m') AND DATE_FORMAT(END_DATE, '%Y-%m'))
    AND a.CAR_TYPE IN ('세단', 'SUV')
    AND c.DURATION_TYPE = '30일 이상'
    GROUP BY CAR_ID, CAR_TYPE
) e
WHERE FEE >= 500000 AND FEE < 2000000
ORDER BY FEE DESC, CAR_TYPE, CAR_ID DESC



