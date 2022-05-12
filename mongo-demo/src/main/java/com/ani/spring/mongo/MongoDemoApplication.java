package com.ani.spring.mongo;

import com.ani.spring.mongo.domain.SocialPost;
import com.ani.spring.mongo.repository.SocialPostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class MongoDemoApplication {

	public static void queries(ApplicationContext ctx) {

		SocialPostRepository repository = ctx.getBean(SocialPostRepository.class);

		SocialPost post = new SocialPost();
		post.setId("abc");
		post.setMsg("Hey hi");
		post.setTm(LocalDate.now());

		repository.save(post);

	}
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MongoDemoApplication.class, args);
		queries(ctx);
	}

}
