-- 코드를 입력하세요
SELECT A.author_id, A.author_name, B.category, SUM(B.price * S.sales) AS 'SALES'
FROM BOOK B
JOIN AUTHOR A
ON a.author_id = B.author_id
JOIN BOOK_SALES S
ON B.book_id = S.book_id
WHERE SUBSTR(S.sales_date, 1,7) = '2022-01'
GROUP BY A.author_id, B.category
ORDER BY A.author_id, B.category desc;