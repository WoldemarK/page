package com.example.page.model.dto.response;

import com.example.page.model.Book;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PaginatedBookResponse {

    private List<Book> bookList;
    private Long numberOfItems;
    private int numberOfPages;
}
