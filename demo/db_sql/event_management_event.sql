CREATE DATABASE event_management;
USE event_management;

CREATE TABLE Event (
    id INT AUTO_INCREMENT PRIMARY KEY,
    eventName VARCHAR(255) NOT NULL,
    eventDate DATE NOT NULL,
    description TEXT,
    organizer_id INT,
    venue_id INT,
    FOREIGN KEY (organizer_id) REFERENCES Organizer(id),
    FOREIGN KEY (venue_id) REFERENCES Venue(id)
);


CREATE TABLE Venue (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    capacity INT NOT NULL
);


CREATE TABLE Organizer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    contactInfo VARCHAR(255) NOT NULL
);
