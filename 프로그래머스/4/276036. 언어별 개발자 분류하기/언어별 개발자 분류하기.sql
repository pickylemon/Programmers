-- 코드를 작성해주세요

# SELECT GRADE, ID, EMAIL
# FROM(
# SELECT 
#     CASE 
#         WHEN (FIND_IN_SET('Python', skills) > 0 AND FIND_IN_SET('Front End', skills) > 0) THEN 'A'
#         WHEN (FIND_IN_SET('C#', skills) > 0) THEN 'B'
#         WHEN (FIND_IN_SET('Front End', skills) > 0) THEN 'C'
#     END AS GRADE,
#     ID,
#     EMAIL
# FROM (
# SELECT 
#     d.ID,
#     d.EMAIL,
#     GROUP_CONCAT(s.NAME,',',s.CATEGORY) AS skills
# FROM 
#     DEVELOPERS d
# JOIN 
#    SKILLCODES s 
# ON 
#     (d.SKILL_CODE & s.CODE) = s.CODE
# GROUP BY 
#     d.ID,
#     d.EMAIL
# ) AS dev_skills
# ) AS grade_dev
# WHERE GRADE IS NOT NULL
# ORDER BY 
#     GRADE, ID;

SELECT d.GRADE as GRADE, d.ID as ID, d.EMAIL as EMAIL
FROM (
    SELECT CASE
       WHEN FIND_IN_SET('Front End', c.CATEGORY)
            && FIND_IN_SET('Python', c.SKILL_NAME) THEN 'A'
       WHEN FIND_IN_SET('C#', c.SKILL_NAME) THEN 'B'
       WHEN FIND_IN_SET('Front End', c.CATEGORY) THEN 'C' END AS GRADE,
       c.ID as ID, c.EMAIL as EMAIL
    FROM (
          SELECT ID, EMAIL, GROUP_CONCAT(b.NAME) SKILL_NAME, 
                 GROUP_CONCAT(DISTINCT(b.CATEGORY)) CATEGORY
          FROM DEVELOPERS a
          JOIN SKILLCODES b
          ON (a.SKILL_CODE & b.CODE) = b.CODE
          GROUP BY ID, EMAIL
          ) c
) d
WHERE d.GRADE IN ('A', 'B', 'C')
ORDER BY GRADE, ID;


