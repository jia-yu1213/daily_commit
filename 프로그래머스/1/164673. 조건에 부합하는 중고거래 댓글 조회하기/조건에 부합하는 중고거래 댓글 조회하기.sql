-- 코드를 입력하세요
SELECT a.TITLE, a.BOARD_ID, b.REPLY_ID, 
b.WRITER_ID, b.CONTENTS, DATE_FORMAT(b.CREATED_DATE,'%Y-%m-%d') as CREATED_DATE
from USED_GOODS_BOARD a, USED_GOODS_REPLY b
where a.board_id = b.board_id
and a.CREATED_DATE like '2022-10%'
order by b.CREATED_DATE, a.TITLE