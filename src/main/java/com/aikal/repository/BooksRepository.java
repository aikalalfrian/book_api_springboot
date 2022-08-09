package com.aikal.repository;

import org.springframework.data.repository.CrudRepository;

import com.aikal.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
