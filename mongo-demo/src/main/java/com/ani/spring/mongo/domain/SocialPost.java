package com.ani.spring.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "posts")
public class SocialPost {

    @Id
    private String id;
    private String msg;
    private LocalDate tm;
}
