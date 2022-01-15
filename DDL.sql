/*그룹코드 table*/
create table image_shop.code_group(
	group_code varchar(3) not null,
    group_name varchar(30) not null,
    reg_date datetime, 
    upd_date datetime,
    use_yn varchar(1),
    primary key(group_code)
)
engine=InnoDB;

create table image_shop.code_detail(
	code_value varchar(3) not null,
    group_code varchar(3) not null,
    code_name varchar(30) not null,
    reg_date datetime, 
    sort_seq integer not null,
    upd_date datetime,
    use_yn varchar(1),
    primary key(code_value, group_code)
)
engine=InnoDB;

/* 회원 table*/
create table image_shop.member(
	user_no bigint not null auto_increment,
    coin integer not null,
    job varchar(3) not null,
    reg_date datetime,
    upd_date datetime,
    user_id varchar(50) not null,
    user_name varchar(100) not null,
    user_pw varchar(200) not null,
    primary key(user_no)
)
engine=InnoDB;

create table image_shop.member_auth(
	user_auth_no bigint not null auto_increment,
    auth varchar(50),
    reg_date datetime,
    upd_date datetime,
    user_no bigint,
    primary key(user_auth_no)
)
engine=InnoDB;

commit;