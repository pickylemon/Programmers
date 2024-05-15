-- 코드를 입력하세요
-- out테이블의 모든 정보는 in테이블에 있어야 한다. in에 테이블이 없다면 유실된 것.
SELECT o.animal_id, o.name
FROM animal_outs o
LEFT OUTER JOIN animal_ins i
ON o.animal_id = i.animal_id
WHERE i.animal_id IS NULL;