1. 平均工资 avg() order by 

2.查询前十条数据 不用limit


3.查出name字段重复次数大于2，money总和大于1000的用户姓名
select name  from table1  group by name having count(*) >3 and sum(money) > '1000' 