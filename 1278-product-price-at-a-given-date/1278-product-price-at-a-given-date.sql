SELECT 
    p.product_id,
    COALESCE(latest_price.new_price, 10) AS price
FROM 
    (SELECT DISTINCT product_id FROM Products) p
LEFT JOIN (
    SELECT product_id, new_price
    FROM Products
    WHERE change_date <= '2019-08-16'
    AND (product_id, change_date) IN (
        SELECT product_id, MAX(change_date)
        FROM Products
        WHERE change_date <= '2019-08-16'
        GROUP BY product_id
    )
) latest_price
ON p.product_id = latest_price.product_id;