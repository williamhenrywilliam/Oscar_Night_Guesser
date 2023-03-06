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
	nomination_5_bottom varchar(100),
	user_selection integer default 0,
	winner integer default 0,
	user_results varchar(100) default ''
);

INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Actor In A Leading Role', 'Austin Butler', 'Elvis', 'Colin Farrell', 'The Banshees Of Inisherin', 'Brendan Fraser', 'The Whale', 'Paul Mescal', 'Aftersun', 'Bill Nighy', 'Living');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Actor In A Supporting Role', 'Brendan Gleeson', 'The Banshees of Inisherin', 'Brian Tyree Henry', 'Causeway', 'Judd Hirsch', 'The Fabelmans', 'Barry Koeghan', 'The Banshees of Inisherin', 'Ke Huy Quan', 'Everything Everywhere All at Once');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Actress In A Leading Role', 'Cate Blanchett', 'Tár', 'Ana De Armas', 'Blonde', 'Andrea Riseborough', 'To Lesli', 'Michelle Williams', 'The Fabelmans', 'Michelle Yeoh', 'Everything Everywhere All at Once');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Actress In A Supporting Role', 'Angela Bassett', 'Black Panther: Wakanda Forever', 'Hong Chau', 'The Whale', 'Kerry Condon', 'The Banshees of Inisherin', 'Jamie Lee Curtis', 'Everything Everywhere All at Once', 'Stephanie Hsu', 'Everything Everywhere All at Once');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Animated Feature Film', 'Guillermo Del Toro''s Pinocchio', 'Guillermo del Toro', 'Marcel the Shell With Shoes On', 'Dean Fleischer Camp', 'Puss in Boots: The Last Wish', 'Joel Crawford', 'The Sea Beast', 'Chris Williams', 'Turning Red', 'Domee Shi');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Cinematography', 'All Quiet on the Western Front', 'James Friend', 'Bardo, False Chronicle of a Handful of Truths', 'Darius Khondji', 'Elvis', 'Mandy Walker', 'Empire of Light', 'Roger Deakins', 'Tár', 'Florian Hoffmeister');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Costume Design', 'Babylon', 'Mary Zophres', 'Black Panther: Wakanda Forever', 'Ruth Carter', 'Elvis', 'Catherine Martin', 'Everything Everywhere All at Once', 'Shirley Kurata', 'Mrs. Harris Goes to Paris', 'Jenny Beavan');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Directing', 'The Banshees of Inisherin', 'Martin McDonagh', 'Everything Everywhere All at Once', 'Daniel Kwan', 'The Fabelmans', 'Steven Spielberg', 'Tár', 'Todd Field', 'Triangle of Sadness', 'Ruben Östlund');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Documentary Feature Film', 'All That Breathes', 'Shaunak Sen', 'All the Beauty and the Bloodshed', 'Laura Poitras', 'Fire of Love', 'Sara Dosa', 'A House Made of Splinters', 'Simon Lereng Wilmont', 'Navalny', 'Daniel Roher');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Documentary Short Film', 'The Elephant Whisperers', 'Kartiki Gonsalves', 'Haulout', 'Evgenia Arbugaeva', 'How Do You Measure a Year?', 'Jay Rosenblatt', 'The Martha Mitchell Effect', 'Anne Alvergue', 'Stranger At The Gate', 'Joshua Seftel');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Film Editing', 'The Banshees of Inisherin', 'Mikkel E.G. Nielsen', 'Elvis', 'Matt Villa', 'Everything Everywhere All at Once', 'Paul Rogers', 'Tár', 'Monika Willi', 'Top Gun: Maverick', 'Eddie Hamilton');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('International Feature Film', 'All Quiet on the Western Front', 'Germany', 'Argentina, 1985', 'Argentina', 'Close', 'Belgium', 'EO', 'Poland', 'The Quiet Girl', 'Ireland');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Makeup and Hairstyling', 'All Quiet on the Western Front', 'Heike Merker', 'The Batman', 'Naomi Donne', 'Black Panther: Wakanda Forever', 'Camille Friend', 'Elvis', 'Mark Coulier', 'The Whale', 'Adrien Morot');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Music (Original Score)', 'All Quiet on the Western Front', 'Volker Bertelmann', 'Babylon', 'Justin Hurwitz', 'The Banshees of Inisherin', 'Carter Burwell', 'Everything Everywhere All at Once', 'Son Lux', 'The Fabelmans', 'John Williams');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Music (Original Song)', 'Applause', 'Tell It like a Woman', 'Hold My Hand', 'Top Gun: Maverick', 'Lift Me Up', 'Black Panther: Wakanda Forever', 'Naatu Naatu', 'RRR', 'This is a Life', 'Everything Everywhere All at Once');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Production Design', 'All Quiet on the Western Front', 'Christian M. Goldbeck', 'Avatar: The Way of Water', 'Dylan Cole', 'Babylon', 'Florencia Martin', 'Elvis', 'Catherine Martin', 'The Fabelmans', 'Rick Carter');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Short Film (Animated)', 'The Boy, The Mole, The Fox and The Horse', 'Charlie Mackesy', 'The Flying Sailor', 'Amanda Forbis', 'Ice Merchants', 'João Gonzalez', 'My Year of Dicks', 'Sara Gunnarsdóttir', 'An Ostrich Told Me The World Is Fake and I Think I Believe It', 'Lachlan Pendragon');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Short Film (Live Action)', 'An Irish Goodbye', 'Tom Berkeley', 'Ivalu', 'Anders Walter', 'Le Pupille', 'Alice Rohrwacher', 'Night Ride', 'Eirik Tveiten', 'The Red Suitcase', 'Cyrus Neshvad');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Sound', 'All Quiet on the Western Front', 'Viktor Prášil', 'Avatar: The Way of Water', 'Julian Howarth', 'The Batman', 'Stuart Wilson', 'Elvis', 'David Lee', 'Top Gun: Maverick', 'Mark Weingarten');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Visual Effects', 'All Quiet on the Western Front', 'Frank Petzold', 'Avatar: The Way of Water', 'Joe Letteri', 'The Batman', 'Dan Lemmon', 'Black Panther: Wakanda Forever', 'Geoffrey Baumann', 'Top Gun: Maverick', 'Ryan Tudhope');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Writing (Adapted Screenplay)', 'All Quiet on the Western Front', 'Edward Berger', 'Glass Onion: A Knives Out Mystery', 'Rian Johnson', 'Living', 'Kazuo Ishiguro', 'Top Gun: Maverick', 'Ehren Kruger', 'Women Talking', 'Sarah Polley');
INSERT INTO categories (category, nomination_1_top, nomination_1_bottom, nomination_2_top, nomination_2_bottom, nomination_3_top, nomination_3_bottom, nomination_4_top, nomination_4_bottom, nomination_5_top, nomination_5_bottom)
VALUES ('Writing (Original Screenplay)', 'The Banshees of Inisherin', 'Martin McDonagh', 'Everything Everywhere All at Once', 'Danial Kwan', 'The Fabelmans', 'Steven Spielberg', 'Tár', 'Todd Field', 'Triangle of Sadness', 'Ruben Östlund');


COMMIT TRANSACTION;



