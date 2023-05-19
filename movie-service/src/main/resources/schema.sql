/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  vako
 * Created: May 9, 2023
 */

create table movie(
id bigint not null auto_increment,
 title varchar(255),
date integer,
imdb varchar(255),  
 primary key (id)  );

create table genre (
id bigint not null auto_increment,
name varchar(255) not null,
movie_id bigint,
 primary key (id) );


alter table genre add constraint FKqsi87i8d4qqdehlv2eiwvpwb foreign key (movie_id) references movie(id);