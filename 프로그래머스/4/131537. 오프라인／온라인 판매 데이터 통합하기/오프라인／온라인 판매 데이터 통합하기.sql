-- 코드를 입력하세요
SELECT date_format(sales_date, '%Y-%m-%d') as SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
from ONLINE_SALE 
where date_format(sales_date, '%Y-%m') like '2022-03%'
union
SELECT date_format(sales_date, '%Y-%m-%d') as SALES_DATE, PRODUCT_ID ,NULL as USER_ID, SALES_AMOUNT
from OFFLINE_SALE  
where date_format(sales_date, '%Y-%m') like '2022-03%'
order by SALES_DATE, PRODUCT_ID, USER_ID 