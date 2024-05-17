-- 코드를 입력하세요
SELECT b.category category, SUM(s.sales) total_sales
FROM book b
JOIN book_sales s
ON b.book_id = s.book_id
WHERE DATE_FORMAT(s.sales_date, '%Y-%m') = '2022-01'
GROUP BY category
ORDER BY category;