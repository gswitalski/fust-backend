--liquibase formatted sql
--changeset gswitalski:1

CREATE TABLE article
(
    id       BIGSERIAL PRIMARY KEY,
    slug     VARCHAR(200) UNIQUE NOT NULL,
    type     VARCHAR(50)         NOT NULL,
    category VARCHAR(50)         NOT NULL,
    created  TIMESTAMP,
    modified TIMESTAMP,
    title    VARCHAR,
    intro    VARCHAR,
    content  TEXT,
    status   VARCHAR(50)         NOT NULL
);
