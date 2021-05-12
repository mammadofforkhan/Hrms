# Hrms 

![GetALL](https://downloader.disk.yandex.ru/preview/37ea6e3535259979ac77301647d60d6c69aedfb9b050f4d8b48ee5a3f31478e3/609bf8c7/zsPkScjZYNcrB9UWzcwzp13zoAEiOL4Yc9Tf2rEt2i3Xh5Mi-pKX-OeUSjABuwwo0iCb0-9Mpjl1Nzr5Urwjcg%3D%3D?uid=0&filename=2021-05-12_15-39-43.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2048x2048)
Genel İş Pozisyonlari Listelendi.

#Database Yapısı :
![GetALL](https://downloader.disk.yandex.ru/preview/082d987942ae586c74c6a1a38288873a83cbbf3b939c10566fb6ff71b41cf363/609bf986/627QWzrB8BNFi6S1Y-Mij18sQdRwRdpgvfH97Qw_WkGoOyNCJ5M9boJCPe6Qr0rLtWqmE7RaY0sjBa_glzk05g%3D%3D?uid=0&filename=2021-05-12_03-22-24.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2048x2048)

#Database Scripti :

Create table if not exists Users(
	id serial Primary Key Not Null,
	email varchar(255) UNIQUE Not Null,
	password varchar(100) Not Null,
	email_verified boolean default false Not Null
	);
Create table if not exists Employees(
	user_id integer Primary Key Not Null,
	first_name varchar(50) Not Null,
	last_name varchar(50) Not Null,
	nationality_id varchar(11) UNIQUE Not Null,
	day_of_birth Date Not Null,
	Foreign Key (user_id) references users(id) ON DELETE CASCADE
	);
	Create table if not exists Employers(
	user_id integer Primary Key Not Null,
	company_name varchar(100) UNIQUE Not Null,
	website varchar(50) UNIQUE Not Null,
	phone_number varchar(25) UNIQUE Not Null,
	hr_verified boolean default false Not Null,
	Foreign Key (user_id) references users(id) ON DELETE CASCADE
	);
	create table if not exists Positions(
	id serial Primary Key Not Null,
	name varchar(50) UNIQUE NOT NULL
	);
	create table if not exists Systemstaffs(
	user_id integer Primary Key Not Null,
	position_id integer Not Null,
	Foreign Key (user_id) references users(id) ON DELETE CASCADE,
	Foreign Key (position_id) references positions(id) ON DELETE CASCADE
	);
	
