package com.ani.spring.testing.repository;

import com.ani.spring.testing.domain.FileUpload;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FileRepository extends CrudRepository<FileUpload, Long> {

    List<FileUpload> findBySizeGreaterThanEqual(Long size);

    @Query(value = "select * from file_upload", nativeQuery = true)
    List<FileUpload> findAll();
}
