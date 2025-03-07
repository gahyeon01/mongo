package com.example.mongo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//document와 매핑될 객체를 정의 - 도메인클래스
//score컬렉션의 한 document와 매핑될 객체
@Document(collection = "score") //<-몽고디비에서 추가된 점2
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreDTO {
    @Id   //<-몽고디비에서 추가된 점1
    String _id;
    String id;
    String name;
    String dept;
    String addr;
    int java;
    int servlet;

}
