package com.ani.spring.testing.repository;

import com.ani.spring.testing.domain.FileUpload;
import org.springframework.data.repository.CrudRepository;

public interface FileRepository extends CrudRepository<FileUpload, Long> {
}
