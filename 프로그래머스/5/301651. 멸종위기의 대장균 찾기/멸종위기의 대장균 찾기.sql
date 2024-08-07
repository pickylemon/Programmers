-- 코드를 작성해주세요
WITH RECURSIVE CTE(GENERATION, ID, PARENT_ID) AS ( 
    SELECT 1 GENERATION, a.ID ID, a.PARENT_ID PARENT_ID
    FROM ECOLI_DATA a
    WHERE a.PARENT_ID IS NULL
    UNION ALL
    SELECT GENERATION + 1, b.ID ID, b.PARENT_ID PARENT_ID
    FROM CTE
    JOIN ECOLI_DATA b
    ON CTE.ID = b.PARENT_ID
    # WHERE EXISTS (SELECT 1 FROM ECOLI_DATA c WHERE c.PARENT_ID = CTE.ID)
) 

SELECT COUNT(*) COUNT, GENERATION
FROM CTE a
WHERE NOT EXISTS (SELECT 1 FROM CTE b WHERE b.PARENT_ID = a.ID)
GROUP BY GENERATION
                
# SELECT COUNT(ID) COUNT, GENERATION
# FROM CTE
# GROUP BY GENERATION
# ORDER BY GENERATION;