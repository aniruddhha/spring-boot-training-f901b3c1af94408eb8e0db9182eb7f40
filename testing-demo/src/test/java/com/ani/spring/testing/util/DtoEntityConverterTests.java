package com.ani.spring.testing.util;


import com.ani.spring.testing.domain.FileUpload;
import com.ani.spring.testing.dto.FileDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DtoEntityConverterTests {

    @DisplayName("Entity To Dto Conversion")
    @Test
    public void testEntityToDtoConversion() {

        FileUpload input = new FileUpload(1L, "abc", 30L);

        FileDto expected = new FileDto(1L, "abc", 30L);

        FileDto actual = DtoEntityConverter.toDto(input);

        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Dto To Entity Conversion")
    @Test
    public void testDtoToEntityConversion() {

        FileDto input = new FileDto(1L, "abc", 30L);

        FileUpload expected = new FileUpload(1L, "abc", 30L);

        FileUpload actual = DtoEntityConverter.toEntity(input);

        Assertions.assertEquals(expected, actual);
    }
}
