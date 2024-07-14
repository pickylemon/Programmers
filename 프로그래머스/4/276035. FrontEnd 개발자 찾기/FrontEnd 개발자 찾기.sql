-- 코드를 작성해주세요
SELECT id, email, first_name, last_name
FROM developers a
WHERE EXISTS (SELECT 1 FROM SKILLCODES
              WHERE CODE & a.SKILL_CODE = CODE
              AND CATEGORY = 'Front End')
ORDER BY a.id 