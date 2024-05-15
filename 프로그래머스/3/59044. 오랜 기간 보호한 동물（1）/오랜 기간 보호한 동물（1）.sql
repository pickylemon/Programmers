-- 코드를 입력하세요
SELECT name, datetime
FROM animal_ins i
WHERE NOT EXISTS (SELECT 'X' 
                 FROM animal_outs o
                 WHERE o.animal_id = i.animal_id)
ORDER BY datetime
LIMIT 3;