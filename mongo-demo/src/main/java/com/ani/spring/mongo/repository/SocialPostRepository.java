package com.ani.spring.mongo.repository;

import com.ani.spring.mongo.domain.SocialPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SocialPostRepository extends MongoRepository<SocialPost, String> {

}
