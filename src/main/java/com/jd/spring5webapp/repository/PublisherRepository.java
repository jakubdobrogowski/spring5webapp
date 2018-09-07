package com.jd.spring5webapp.repository;

import com.jd.spring5webapp.domain.books.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
