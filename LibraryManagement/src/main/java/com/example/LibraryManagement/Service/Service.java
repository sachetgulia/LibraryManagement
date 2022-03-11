package com.example.LibraryManagement.Service;

import com.example.LibraryManagement.Dto.Book;
import com.example.LibraryManagement.Dto.User;

public interface Service {
    void addUser(User u);
    void addBook(Book b);
    void issueBook(int bid,int uid);
    void returnBook(int uid,int bid);
    void mostPopularBook();
    void userWithMostBooks();
}

