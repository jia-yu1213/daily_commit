-- 코드를 입력하세요
SELECT outs.ANIMAL_ID, outs.NAME
from ANIMAL_OUTS outs, ANIMAL_INS ins
where ins.ANIMAL_ID = outs.ANIMAL_ID
 and ins.DATETIME > outs.DATETIME
order by ins.DATETIME 