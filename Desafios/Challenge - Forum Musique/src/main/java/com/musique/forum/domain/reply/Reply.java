package com.musique.forum.domain.reply;

import com.musique.forum.domain.topic.Topic;
import com.musique.forum.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "replies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private LocalDateTime creationDate = LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    public Reply(ReplyDTO replyDTO) {
        this.message = replyDTO.message();
    }

    public void updateReply(UpdateReplyDTO updateReplyDTO) {
        if (updateReplyDTO.message() != null) {
            this.message = updateReplyDTO.message();
        }
    }
}
