package com.ani.spring.testing.util;

import com.ani.spring.testing.domain.FileUpload;
import com.ani.spring.testing.dto.FileDto;

public class DtoEntityConverter {

    public static FileUpload toEntity(FileDto dto) {
        return new FileUpload(
                dto.getId(),
                dto.getName(),
                dto.getSize()
        );
    }

    public static FileDto toDto(FileUpload entity) {
        return new FileDto(
                entity.getId(),
                entity.getName(),
                entity.getSize()
        );
    }
}
