package com.ani.spring.testing.repository;


import com.ani.spring.testing.domain.FileUpload;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class FileRepositoryTests {

    @Autowired
    private FileRepository repository;

    @Autowired
    private EntityManager manager;

    @Order(1)
    @Test
    public void testSaving() {

        FileUpload entity = new FileUpload();
        entity.setId(1L);
        entity.setName("abc");
        entity.setSize(10L);
        repository.save(entity);

        FileUpload actual = manager.find(FileUpload.class, 1L);
        Assertions.assertNotNull(actual);
    }

    @Order(2)
    @Test
    public void testGreaterEqual() {
        List<FileUpload> files = repository.findBySizeGreaterThanEqual(10L);
        Assertions.assertEquals(0, files.size());
    }

    @Order(3)
    @Test
    public void testFindAll() {

        FileUpload entity = new FileUpload();
        entity.setId(1L);
        entity.setName("abc");
        entity.setSize(10L);
        repository.save(entity);

        List<FileUpload> files = repository.findAll();

            Assertions.assertEquals(1, files.size());
    }
}
