CREATE TABLE announcement (
    id UUID PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    details_id UUID NOT NULL,
    metadata_id UUID NOT NULL
);

CREATE TABLE announcement_details (
    id UUID PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    location UUID NOT NULL,
    metadata_id UUID NOT NULL
);

ALTER TABLE announcement
ADD CONSTRAINT fk_details
FOREIGN KEY (details_id) REFERENCES announcement_details(id);

CREATE TABLE announcement_metadata (
    id UUID PRIMARY KEY,
    creationDate DATETIME,
    expirationDate DATETIME,
    applicationCounter SMALLINT
);

ALTER TABLE announcement
ADD CONSTRAINT fk_metadata
FOREIGN KEY (metadata_id) REFERENCES announcement_metadata(id);

CREATE TABLE technology_fk (
    id UUID PRIMARY KEY,
    announcement_details_id UUID NOT NULL,
    technology_id UUID NOT NULL
);

CREATE TABLE technology (
    id UUID PRIMARY KEY,
    name VARCHAR(60) NOT NULL
);

CREATE TABLE location (
    id UUID PRIMARY KEY,
    country VARCHAR(30) NOT NULL,
    country_code VARCHAR(5) NOT NULL,
    city VARCHAR(50) NOT NULL,
    street VARCHAR(50) NOT NULL,
    postalCode VARCHAR(10) NOT NULL,
    latitude numeric(10, 5),
    longitude numeric(10, 5)
);

CREATE TABLE contract_type (
    id UUID PRIMARY KEY,
    name VARCHAR(15) NOT NULL
);

CREATE TABLE contract_type_fk (
    id UUID PRIMARY KEY,
    details_id UUID NOT NULL,
    contract_type_id UUID NOT NULL
);

CREATE TABLE announcement_description (
    id UUID PRIMARY KEY,
    short_description VARCHAR(1000),
    full_description VARCHAR(4000)
);

CREATE TABLE company (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location_id UUID NOT NULL
);