package com.ani.spring.testing;

import com.ani.spring.testing.dto.AppRes;
import com.ani.spring.testing.dto.FileDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestingDemoApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(restTemplate);
	}

	@Test
	void testSaveFileApi() {

		FileDto dto = new FileDto();
		dto.setId(1L);
		dto.setName("abc");
		dto.setSize(10L);

		HttpEntity<FileDto> reqEntity = new HttpEntity<>(dto);

		ResponseEntity<AppRes> resEntity = restTemplate.exchange(
				"http://localhost:"+port+"/file",
				HttpMethod.POST,
				reqEntity,
				AppRes.class
		);

		AppRes reqDto = resEntity.getBody();
		Assertions.assertEquals(reqDto.getSts(), "success");
		Assertions.assertEquals(reqDto.getMsg(), "saved");
	}
}
