package com.ani.spring.testing.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class FileDto {
    private Long id;
    private String name;
    private Long size;
}
