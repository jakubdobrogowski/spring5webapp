package com.jd.spring5webapp.repository;

import com.jd.spring5webapp.domain.books.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
