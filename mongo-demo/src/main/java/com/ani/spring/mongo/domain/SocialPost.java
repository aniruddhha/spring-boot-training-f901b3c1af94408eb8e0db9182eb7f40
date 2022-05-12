package com.ani.spring.mongo.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Data
@Document("posts")
public class SocialPost {

    @MongoId
    private String id;
    private String msg;
    private LocalDate tm;
}
