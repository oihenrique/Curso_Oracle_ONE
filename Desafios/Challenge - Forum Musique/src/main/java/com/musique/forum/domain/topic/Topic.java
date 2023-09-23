package com.musique.forum.domain.topic;

import com.musique.forum.domain.reply.Reply;
import com.musique.forum.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "topics")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Topic {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private LocalDateTime creationDate = LocalDateTime.now();
    private TopicStatus status = TopicStatus.OPENED_NOT_REPLIED;
    @ManyToOne
    private User author;
    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL)
    private List<Reply> replies = new ArrayList<>();

    public Topic(TopicDTO topicDTO, User author) {
        this.title = topicDTO.title();
        this.message = topicDTO.message();
        this.author = author;
    }

    public void updatePost(UpdateTopicDTO update) {
        if (update.title() != null) {
            this.title = update.title();
        }
        if (update.message() != null) {
            this.message = update.message();
        }
        if (update.status() != null) {
            this.status = update.status();
        }
    }
}
