-- 코드를 작성해주세요
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python') > 0
OR SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#') > 0
ORDER BY ID;


# 이건 왜 안되는걸까? 
# SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
# FROM DEVELOPERS 
# WHERE 
# (SKILL_CODE >> 10) % 2 = 1
# OR
# (SKILL_CODE >> 8) % 2 = 1
# ORDER BY ID;

 