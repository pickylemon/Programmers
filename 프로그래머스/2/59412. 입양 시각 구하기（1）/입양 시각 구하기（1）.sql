-- 코드를 입력하세요
SELECT t.HOUR HOUR, COUNT(ANIMAL_ID) COUNT
FROM (SELECT HOUR(DATETIME) HOUR, ANIMAL_ID
     FROM ANIMAL_OUTS
     WHERE HOUR(DATETIME) BETWEEN 9 AND 19) t
GROUP BY t.HOUR
ORDER BY t.HOUR;