-- 현재 AutoCommit 여부를 확인합니다.
SELECT @@AUTOCOMMIT;

-- AutoCommit 반드시 해제해야 합니다.
SET AUTOCOMMIT = 0;

commit;

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

/* 회원 게시판 table*/
create table image_shop.board(
	board_no bigint not null auto_increment,
    content longtext,
    reg_date datetime, 
    title varchar(200) not null,
    upd_date datetime,
    writer varchar(50) not null,
    primary key(board_no)
)
engine=InnoDB;

/* 공지사항 게시판 table*/
create table image_shop.notice(
	notice_no bigint not null auto_increment,
    content longtext,
    reg_date datetime,
    title varchar(200) not null,
    upd_date datetime,
    primary key(notice_no)
)
engine=InnoDB;

/* 상품 table */
create table item (
	item_id bigint not null auto_increment,
    description varchar(250),
    item_name varchar(50) not null,
    picture_url varchar(200),
    preview_url varchar(200),
    price integer,
    reg_date datetime, 
    upd_date datetime,
    primary key(item_id)
)
engine=InnoDB;

/* 사용자 상품 테이블 */
create table user_item (
	user_item_no bigint not null auto_increment,
    item_id bigint, 
    reg_date datetime,
    upd_date datetime,
    user_no bigint,
    primary key(user_item_no)
)
engine=InnoDB;

/* 자료실 table */
create table pds(
	item_id bigint not null auto_increment,
    description varchar(255),
    item_name varchar(255),
    reg_date datetime,
    upd_date datetime,
    view_cnt integer,
    primary key(item_id)
)
engine=InnoDB;

/* 자료실 첨부파일 table */
create table pds_file (
	pds_file_id bigint not null auto_increment,
    down_cnt integer,
    full_name varchar(200),
    reg_date datetime,
    upd_date datetime,
    item_id bigint,
    primary key(pds_file_id)
)
engine=InnoDB;

alter table pds_file 
add constraint FKfksyos2ceo6mik0iv3ue602yq 
foreign key(item_id) references pds(item_id);

/* 충전내역 table */
create table charge_coin_history(
	history_no bigint not null auto_increment,
    amount integer not null,
	reg_date datetime,
    upd_date datetime,
    user_no bigint,
    primary key(history_no)
)
engine=InnoDB;

/* 지급내역 table */
create table pay_coin_history (
	history_no bigint not null auto_increment,
    amount integer not null,
    item_id bigint,
    item_name varchar(255),
    reg_date datetime,
    upd_date datetime,
    user_no bigint,
    primary key(history_no)
)
engine=InnoDB;

/* 접근 log table */
create table access_log(
	log_no bigint not null auto_increment,
    class_name varchar(100) not null,
    class_simple_name varchar(50) not null,
    method_name varchar(100) not null,
    reg_date datetime,
    remote_addr varchar(50) not null,
    request_uri varchar(200) not null,
    upd_date datetime,
    primary key(log_no)
)
engine=InnoDB;

/* 서비스 성능 log table */
create table performance_log(
	log_no bigint not null auto_increment,
    duration_time bigint,
    reg_date datetime,
    signature_name varchar(50) not null,
    signature_type_name varchar(100) not null,
    upd_date datetime,
    primary key(log_no)
)
engine=InnoDB;

commit;

