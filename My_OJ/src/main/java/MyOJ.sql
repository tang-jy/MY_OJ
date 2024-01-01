show databases ;

create database if not exists MyOJ;

use MyOJ;

drop table if exists OJ_table;

create table OJ_table (
                          id int primary key auto_increment,
                          title varchar(50),
                          level varchar(50),
                          description varchar(4096),
                          codeTemplate varchar(4096),
                          codeTest varchar(4096)
);

desc oj_table;

select *from oj_table;

--  以上为题目的创建
-- 我是铸币,sql 建立佬已经写好创建的sql语句了,在dao.UserImpl里面
--CREATE TABLE user (
--    userId INT PRIMARY KEY AUTO_INCREMENT,
--    role INT NOT NULL,
--    userName VARCHAR(255) NOT NULL,
--    nickName VARCHAR(255),
--    password VARCHAR(255) NOT NULL
--);

-- 如果需要添加索引，可以使用以下语句
-- CREATE INDEX idx_user_name ON user(userName);
