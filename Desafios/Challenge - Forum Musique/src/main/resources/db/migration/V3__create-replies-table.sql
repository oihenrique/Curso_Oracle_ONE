CREATE TABLE replies (
    id BIGINT NOT NULL AUTO_INCREMENT,
    message TEXT,
    creation_date DATETIME,
    topic_id BIGINT,
    author_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (topic_id) REFERENCES topics (id),
    FOREIGN KEY (author_id) REFERENCES users (id)
);
