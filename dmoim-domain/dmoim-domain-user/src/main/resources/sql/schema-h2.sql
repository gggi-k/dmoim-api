create schema USER;

comment on schema USER is '사용자';

create table USER_TB
(
    USER_ID LONG auto_increment,
    PASSWORD VARCHAR2(200) not null,
    NICK_NAME VARCHAR2(30) not null,
    REM_YN CHAR(1) default 'N' not null,
    REG_DT DATETIME,
    UPD_DT DATETIME,
    constraint USER_TB_PK
        primary key (USER_ID)
);

comment on table USER_TB is '사용자';

create unique index USER_TB_USER_ID_UINDEX
	on USER_TB (USER_ID);

