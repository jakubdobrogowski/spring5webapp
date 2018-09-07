create table author_book (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id)) engine=InnoDB;
create table autor (id bigint not null, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB;
create table hibernate_sequence (next_val bigint) engine=InnoDB;
insert into hibernate_sequence values ( 1 );
insert into hibernate_sequence values ( 1 );
insert into hibernate_sequence values ( 1 );
insert into hibernate_sequence values ( 1 );
insert into hibernate_sequence values ( 1 );
create table kasiazki (id bigint not null, isbn varchar(255), title varchar(255), publisher_id bigint, primary key (id)) engine=InnoDB;
create table publisher (id bigint not null, adress varchar(255), name varchar(255), primary key (id)) engine=InnoDB;
create table user (id bigint not null, email varchar(255), first_name varchar(255), last_name varchar(255), password_hash varchar(255), user_address_id bigint, primary key (id)) engine=InnoDB;
create table user_address (id bigint not null, city varchar(255), country varchar(255), postal_code varchar(255), street varchar(255), user_id bigint, primary key (id)) engine=InnoDB;
alter table author_book add constraint FK78sc195e7lvjgj5e33xf6dp86 foreign key (author_id) references autor (id);
alter table author_book add constraint FKhyux3k27xp60ax4rrtsaaat7y foreign key (book_id) references kasiazki (id);
alter table kasiazki add constraint FK56y22wpuemt77dmauhhhngb26 foreign key (publisher_id) references publisher (id);
alter table user add constraint FK20x625ux9m5akvxbh58de7vqe foreign key (user_address_id) references user_address (id);
alter table user_address add constraint FKk2ox3w9jm7yd6v1m5f68xibry foreign key (user_id) references user (id);
create table author_book (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id)) engine=InnoDB
create table autor (id bigint not null, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table kasiazki (id bigint not null, isbn varchar(255), title varchar(255), publisher_id bigint, primary key (id)) engine=InnoDB
create table publisher (id bigint not null, adress varchar(255), name varchar(255), primary key (id)) engine=InnoDB
create table user (id bigint not null, email varchar(255), first_name varchar(255), last_name varchar(255), password_hash varchar(255), user_address_id bigint, primary key (id)) engine=InnoDB
create table user_address (id bigint not null, city varchar(255), country varchar(255), postal_code varchar(255), street varchar(255), user_id bigint, primary key (id)) engine=InnoDB
alter table author_book add constraint FK78sc195e7lvjgj5e33xf6dp86 foreign key (author_id) references autor (id)
alter table author_book add constraint FKhyux3k27xp60ax4rrtsaaat7y foreign key (book_id) references kasiazki (id)
alter table kasiazki add constraint FK56y22wpuemt77dmauhhhngb26 foreign key (publisher_id) references publisher (id)
alter table user add constraint FK20x625ux9m5akvxbh58de7vqe foreign key (user_address_id) references user_address (id)
alter table user_address add constraint FKk2ox3w9jm7yd6v1m5f68xibry foreign key (user_id) references user (id)
create table author_book (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id)) engine=InnoDB
create table autor (id bigint not null, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table kasiazki (id bigint not null, isbn varchar(255), title varchar(255), publisher_id bigint, primary key (id)) engine=InnoDB
create table publisher (id bigint not null, adress varchar(255), name varchar(255), primary key (id)) engine=InnoDB
create table user (id bigint not null, email varchar(255), first_name varchar(255), last_name varchar(255), password_hash varchar(255), user_address_id bigint, primary key (id)) engine=InnoDB
create table user_address (id bigint not null, city varchar(255), country varchar(255), postal_code varchar(255), street varchar(255), user_id bigint, primary key (id)) engine=InnoDB
alter table author_book add constraint FK78sc195e7lvjgj5e33xf6dp86 foreign key (author_id) references autor (id)
alter table author_book add constraint FKhyux3k27xp60ax4rrtsaaat7y foreign key (book_id) references kasiazki (id)
alter table kasiazki add constraint FK56y22wpuemt77dmauhhhngb26 foreign key (publisher_id) references publisher (id)
alter table user add constraint FK20x625ux9m5akvxbh58de7vqe foreign key (user_address_id) references user_address (id)
alter table user_address add constraint FKk2ox3w9jm7yd6v1m5f68xibry foreign key (user_id) references user (id)
create table author_book (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id)) engine=InnoDB
create table autor (id bigint not null, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table kasiazki (id bigint not null, isbn varchar(255), title varchar(255), publisher_id bigint, primary key (id)) engine=InnoDB
create table publisher (id bigint not null, adress varchar(255), name varchar(255), primary key (id)) engine=InnoDB
create table user (id bigint not null, email varchar(255), first_name varchar(255), last_name varchar(255), password_hash varchar(255), user_address_id bigint, primary key (id)) engine=InnoDB
create table user_address (id bigint not null, city varchar(255), country varchar(255), postal_code varchar(255), street varchar(255), user_id bigint, primary key (id)) engine=InnoDB
alter table author_book add constraint FK78sc195e7lvjgj5e33xf6dp86 foreign key (author_id) references autor (id)
alter table author_book add constraint FKhyux3k27xp60ax4rrtsaaat7y foreign key (book_id) references kasiazki (id)
alter table kasiazki add constraint FK56y22wpuemt77dmauhhhngb26 foreign key (publisher_id) references publisher (id)
alter table user add constraint FK20x625ux9m5akvxbh58de7vqe foreign key (user_address_id) references user_address (id)
alter table user_address add constraint FKk2ox3w9jm7yd6v1m5f68xibry foreign key (user_id) references user (id)
create table author_book (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id)) engine=InnoDB
create table autor (id bigint not null, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table kasiazki (id bigint not null, isbn varchar(255), title varchar(255), publisher_id bigint, primary key (id)) engine=InnoDB
create table publisher (id bigint not null, adress varchar(255), name varchar(255), primary key (id)) engine=InnoDB
create table user (id bigint not null, email varchar(255), first_name varchar(255), last_name varchar(255), password_hash varchar(255), user_address_id bigint, primary key (id)) engine=InnoDB
create table user_address (id bigint not null, city varchar(255), country varchar(255), postal_code varchar(255), street varchar(255), user_id bigint, primary key (id)) engine=InnoDB
alter table author_book add constraint FK78sc195e7lvjgj5e33xf6dp86 foreign key (author_id) references autor (id)
alter table author_book add constraint FKhyux3k27xp60ax4rrtsaaat7y foreign key (book_id) references kasiazki (id)
alter table kasiazki add constraint FK56y22wpuemt77dmauhhhngb26 foreign key (publisher_id) references publisher (id)
alter table user add constraint FK20x625ux9m5akvxbh58de7vqe foreign key (user_address_id) references user_address (id)
alter table user_address add constraint FKk2ox3w9jm7yd6v1m5f68xibry foreign key (user_id) references user (id)
create table author_book (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id)) engine=InnoDB
create table autor (id bigint not null, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table kasiazki (id bigint not null, isbn varchar(255), title varchar(255), publisher_id bigint, primary key (id)) engine=InnoDB
create table publisher (id bigint not null, adress varchar(255), name varchar(255), primary key (id)) engine=InnoDB
create table user (id bigint not null, email varchar(255), first_name varchar(255), last_name varchar(255), password_hash varchar(255), user_address_id bigint, primary key (id)) engine=InnoDB
create table user_address (id bigint not null, city varchar(255), country varchar(255), postal_code varchar(255), street varchar(255), user_id bigint, primary key (id)) engine=InnoDB
alter table author_book add constraint FK78sc195e7lvjgj5e33xf6dp86 foreign key (author_id) references autor (id)
alter table author_book add constraint FKhyux3k27xp60ax4rrtsaaat7y foreign key (book_id) references kasiazki (id)
alter table kasiazki add constraint FK56y22wpuemt77dmauhhhngb26 foreign key (publisher_id) references publisher (id)
alter table user add constraint FK20x625ux9m5akvxbh58de7vqe foreign key (user_address_id) references user_address (id)
alter table user_address add constraint FKk2ox3w9jm7yd6v1m5f68xibry foreign key (user_id) references user (id)
