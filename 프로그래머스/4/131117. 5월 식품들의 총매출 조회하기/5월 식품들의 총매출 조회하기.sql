-- 코드를 입력하세요
SELECT f.product_id, f.product_name, f.price * o.total_amount as total_sales
FROM food_product f 
JOIN (SELECT product_id, SUM(amount) as total_amount 
      FROM food_order 
      WHERE produce_date BETWEEN '2022-05-01' AND '2022-05-31'
      GROUP BY product_id ) o
ON f.product_id = o.product_id
ORDER BY total_sales DESC, product_id;
