BEGIN TRANSACTION;

DROP TABLE IF EXISTS categories;

CREATE TABLE categories (
	id SERIAL,
	category varchar(100) NOT NULL UNIQUE,
	nomination_1_top varchar(100),
	nomination_1_bottom varchar(100),
	nomination_2_top varchar(100),
	nomination_2_bottom varchar(100),
	nomination_3_top varchar(100),
	nomination_3_bottom varchar(100),
	nomination_4_top varchar(100),
	nomination_4_bottom varchar(100),
	nomination_5_top varchar(100),
	nomination_5_bottom varchar(100)
);

INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom) VALUES ('Actor In A Leading Role', 'Austin Butler', 'Elvis', 'Colin Farrell', 'The Banshees Of Inisherin', 'Brendan Fraser', 'The Whale', 'Paul Mescal', 'Aftersun', 'Bill Nighy', 'Living');

COMMIT TRANSACTION;



