package com.jd.spring5webapp.repository;

import com.jd.spring5webapp.domain.books.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
