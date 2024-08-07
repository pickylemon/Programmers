-- 코드를 작성해주세요
WITH RECURSIVE CTE (GENERATION, ID, PARENT_ID)
AS (SELECT 1, a.ID, a.PARENT_ID
    FROM ECOLI_DATA a
    WHERE PARENT_ID IS NULL
    UNION ALL
    SELECT GENERATION+1, b.ID, b.PARENT_ID
    FROM ECOLI_DATA b
    INNER JOIN CTE
    ON CTE.ID = b.PARENT_ID)
    
SELECT ID FROM CTE
WHERE GENERATION = 3