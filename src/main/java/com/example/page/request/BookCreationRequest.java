package com.example.page.model.dto.request;

import lombok.Data;

@Data
public class BookCreationRequest {

    private String name;
    private String isbn;
    private String imageUrl;
    private Long authorId;
}
