-- 코드를 입력하세요
SELECT b.FLAVOR
FROM ICECREAM_INFO b
JOIN FIRST_HALF a
ON b.FLAVOR = a.FLAVOR
WHERE TOTAL_ORDER > 3000
AND b.INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC;
