CREATE TABLE topics (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(255),
    message TEXT,
    creation_date DATETIME,
    status VARCHAR(255),
    author_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (author_id) REFERENCES users (id)
);
