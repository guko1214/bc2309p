create database bootcamp_exercise4;

use bootcamp_exercise4;

create table players (
	player_id integer not null unique,
    group_id integer not null
);

create table matches (
	match_id integer not null unique,
    first_player integer not null,
    second_player integer not null,
    first_score integer not null,
    second_score integer not null
);

insert into players (player_id, group_id) values 
(20,2),
(30,2),
(40,2),
(45,2),
(60,2),
(65,2);

insert into matches (match_id,first_player, second_player, first_score, second_score) values
(1,20, 45, 10,12),
(,,,,),
(,,,,),
(,,,,),
(,,,,),
