create database if not exists mybatis;

use mybatis;

create table user(
  id int unsiqned primary key auto_increment comment 'ID',
  name varchar(100) comment '姓名',
  age tinyint unsigned comment '年龄',
  gender tinyint unsigned comment '性别 1：男 2：女',
  phone varchar(11) comment '手机号',
) comment '用户表';

insert into user (id, name, age, gender, phone) values (null, '张三', 18, 1, '18888888881');
insert into user (id, name, age, gender, phone) values (null, '张四', 18, 1, '18888888882');
insert into user (id, name, age, gender, phone) values (null, '张五', 18, 1, '18888888883');
insert into user (id, name, age, gender, phone) values (null, '张六', 18, 1, '18888888884');
insert into user (id, name, age, gender, phone) values (null, '张七', 18, 1, '18888888885');
insert into user (id, name, age, gender, phone) values (null, '张八', 18, 1, '18888888886');