CREATE DATABASE announcement;

CREATE SCHEMA IF NOT EXISTS announcement  ;

CREATE TABLE Announcement (
    id UUID PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    details_text VARCHAR(1000) NOT NULL,
    details_author VARCHAR(255) NOT NULL,
    metadata_source VARCHAR(255) NOT NULL,
    metadata_date DATE NOT NULL
);