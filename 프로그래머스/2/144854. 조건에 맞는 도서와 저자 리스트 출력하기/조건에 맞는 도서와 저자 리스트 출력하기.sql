-- 코드를 입력하세요
SELECT a.BOOK_ID, b.AUTHOR_NAME, date_format(a.PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
from BOOK a, AUTHOR b 
where a.AUTHOR_ID = b.AUTHOR_ID
and a.CATEGORY = '경제'
order by PUBLISHED_DATE