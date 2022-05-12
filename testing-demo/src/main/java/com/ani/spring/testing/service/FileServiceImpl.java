package com.ani.spring.testing.service;

import com.ani.spring.testing.domain.FileUpload;
import com.ani.spring.testing.dto.FileDto;
import com.ani.spring.testing.exception.TooLargeFileException;
import com.ani.spring.testing.repository.FileRepository;
import com.ani.spring.testing.util.DtoEntityConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Transactional
@Service
public class FileServiceImpl implements FileService {

    private FileRepository repository;

    @Override
    public String saveFile(FileDto dto) {
        if(dto.getSize() > 50L) throw new TooLargeFileException("File Size Exceeded");

        FileUpload upload = DtoEntityConverter.toEntity(dto);
        repository.save(upload);
        return "saved";
    }
}
