package miu.edu.pagination_demo.service;

import miu.edu.pagination_demo.dto.BookRequestDto;
import miu.edu.pagination_demo.dto.BookResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<List<BookResponseDto>> addAllBooks(List<BookRequestDto> bookRequestDtos);
    Page<BookResponseDto> findAll(int pageNumber, int pageSize, String direction, String sortBy);
}