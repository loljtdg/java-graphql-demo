package com.javagraphql.demo.model;
import lombok.Data;

@Data
public class NoteInput {
    private Integer userId;

    private String title;
    private String content;
}
