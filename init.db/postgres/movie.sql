DROP TABLE IF EXISTS movie;

CREATE TABLE movie (
    id smallserial PRIMARY KEY,
    title VARCHAR(80),
    directed_by VARCHAR(80),
    year_of_release NUMERIC(4),
    rating NUMERIC(2,1),
    genre VARCHAR(150),
    imdb_id VARCHAR(15),
    created_by VARCHAR(80),
    created_at TIMESTAMP,
    modified_by VARCHAR(80),
    modified_at TIMESTAMP,
    UNIQUE(imdb_id)
);