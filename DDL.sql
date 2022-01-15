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

commit;