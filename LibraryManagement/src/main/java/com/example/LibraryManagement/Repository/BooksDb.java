package com.example.LibraryManagement.Repository;

import com.example.LibraryManagement.Dto.Book;
import com.example.LibraryManagement.Dto.User;
import com.example.LibraryManagement.Entity.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksDb extends CrudRepository<Books,Integer> {
}
