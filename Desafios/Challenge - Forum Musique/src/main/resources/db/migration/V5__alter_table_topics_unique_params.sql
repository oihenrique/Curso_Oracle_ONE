ALTER TABLE topics
ADD CONSTRAINT uk_title_message UNIQUE (title, message(500));