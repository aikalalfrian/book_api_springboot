package com.aikal.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aikal.model.Books;
import com.aikal.repository.BooksRepository;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;

    // get all book record from the database
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    // get a book record from the database by id
    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }

    // post a book record to the database
    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    // delete a book record from the database by id
    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    // updating a record
    public void update(Books books, int bookid) {
        booksRepository.save(books);
    }
}