-- 코드를 작성해주세요
SELECT COUNT(t.ID) FISH_COUNT, t.MONTH
FROM (SELECT MONTH(TIME) MONTH, ID
     FROM FISH_INFO) t
GROUP BY t.MONTH
ORDER BY t.MONTH;
