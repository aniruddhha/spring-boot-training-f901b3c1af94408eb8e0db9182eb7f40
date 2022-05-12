package com.ani.spring.testing.controller;

import com.ani.spring.testing.dto.FileDto;
import com.ani.spring.testing.service.FileService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.regex.Matcher;


@WebMvcTest(FileController.class) // does not loads app context
//@SpringBootTest // this loads app context
//@AutoConfigureMockMvc
public class FileControllerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private FileService service;

    @DisplayName("Testing File Save Endpoint Status")
    @Test
    public void testSaveFile() throws Exception {

        FileDto dto = new FileDto();
        dto.setId(1L);
        dto.setName("abc");
        dto.setSize(10L);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(dto);

        mvc.perform(
                MockMvcRequestBuilders
                        .post("/file/")
                        .contentType("application/json") // I am sending json
                        .accept("application/json") // I am receiving json
                        .content(jsonString)
        ).andExpect(
                MockMvcResultMatchers
                        .status()
                        .isOk()
        );
    }

    @DisplayName("Testing File Save Endpoint Json")
    @Test
    public void testSaveFileResponse() throws Exception{
        FileDto dto = new FileDto();
        dto.setId(1L);
        dto.setName("abc");
        dto.setSize(10L);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(dto);

        mvc.perform(
                MockMvcRequestBuilders
                        .post("/file/")
                        .contentType("application/json") // I am sending json
                        .accept("application/json") // I am receiving json
                        .content(jsonString)
        ).andExpect(
                MockMvcResultMatchers
                        .jsonPath("$.sts")
                        .value("success")
        );
    }
}
