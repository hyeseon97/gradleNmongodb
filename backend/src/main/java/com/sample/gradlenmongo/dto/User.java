package com.sample.gradlenmongo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document
public class User {
    @Id
    private String id;
    private String name;
    private String email;

    // 기본 생성자, getter 및 setter 생략
}