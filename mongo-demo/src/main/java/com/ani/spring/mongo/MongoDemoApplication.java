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

		SocialPost post1 = new SocialPost();
		post1.setId("lmn");
		post1.setMsg("Hey hi");
		post1.setTm(LocalDate.now());
//		repository.insert(post1);

		SocialPost post2 = new SocialPost();
		post2.setId("uuu");
		post2.setMsg("Hey hi");
		post2.setTm(LocalDate.now());
//		repository.insert(post2);

		repository.findAll().forEach(System.out::println);

		repository.deleteById("lmn");
		repository.findAll().forEach(System.out::println);

	}
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MongoDemoApplication.class, args);
		queries(ctx);
	}

}
