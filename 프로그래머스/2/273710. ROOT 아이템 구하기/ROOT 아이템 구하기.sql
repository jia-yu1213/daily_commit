-- 코드를 작성해주세요

select a.item_id, b.item_name from item_tree a, item_info b
where a.item_id = b.item_id and a.parent_item_id is null