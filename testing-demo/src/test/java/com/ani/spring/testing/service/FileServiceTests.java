package com.ani.spring.testing.service;

import com.ani.spring.testing.domain.FileUpload;
import com.ani.spring.testing.dto.FileDto;
import com.ani.spring.testing.exception.TooLargeFileException;
import com.ani.spring.testing.repository.FileRepository;
import com.ani.spring.testing.util.DtoEntityConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
//@SpringBootTest
public class FileServiceTests {

    @Mock
    private FileRepository repository;

//    @Autowired
    @InjectMocks
    private FileServiceImpl service;

    @Test
    public void testServiceValidCase() {
        FileDto dto = new FileDto();
        dto.setId(1L);
        dto.setName("abc");
        dto.setSize(10L);

        String expected = "saved";
        String actual = service.saveFile(dto);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testServiceValidCaseMocking() {

        FileDto dto = new FileDto();
        dto.setId(1L);
        dto.setName("abc");
        dto.setSize(10L);

        FileUpload entity = DtoEntityConverter.toEntity(dto);

        BDDMockito.given(
                    repository.save(entity)
                ).willReturn(
                        entity
                );

        String expected = "saved";
        String actual = service.saveFile(dto);
        service.saveFile(dto);
        service.saveFile(dto);
        service.saveFile(dto);
        service.saveFile(dto);
        service.saveFile(dto);
        service.saveFile(dto);
        service.saveFile(dto);

        Assertions.assertEquals(expected, actual);

        Mockito.verify(
                repository,
                Mockito.times(8)
        ).save(entity);
    }

    @Test
    public void testExceptionWorking() {

        Assertions.assertThrows(TooLargeFileException.class, () -> {
            FileDto dto = new FileDto();
            dto.setId(1L);
            dto.setName("abc");
            dto.setSize(100L);

//            FileUpload entity = DtoEntityConverter.toEntity(dto);

//            BDDMockito.given(
//                    repository.save(entity)
//            ).willReturn(
//                    entity
//            );

            service.saveFile(dto);
        });
    }


}
