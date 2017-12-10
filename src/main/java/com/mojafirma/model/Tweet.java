package com.mojafirma.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int tweetId;

    @Column (name = "tweet_Time")
    private LocalDateTime tweetDateTime;

    @Column
    private String message;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
}
