--https://leetcode.com/problems/product-sales-analysis-i/?envType=study-plan-v2&envId=top-sql-50
SELECT Product.product_name, year, price FROM Sales
LEFT JOIN Product ON Sales.product_id = Product.product_id;