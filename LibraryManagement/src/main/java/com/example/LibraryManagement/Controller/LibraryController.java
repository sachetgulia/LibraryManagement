package com.example.LibraryManagement.Controller;

import com.example.LibraryManagement.Dto.Book;
import com.example.LibraryManagement.Dto.User;
import com.example.LibraryManagement.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import java.awt.print.Book;

@RestController
public class LibraryController {
    @Autowired
    Service st;

    @PostMapping(value="/addUser",consumes = "application/json")
    public void addUser(@RequestBody User user){
        st.addUser(user);
    }
    @PostMapping(value="/addBook",consumes = "application/json")
    public void addBook(@RequestBody Book b){
        st.addBook(b);
    }

    @PostMapping(value="/issueBook",consumes = "application/json")
    public void issueBook(@RequestParam int bid,@RequestParam int uid){
        st.issueBook(bid,uid);
    }
    @PutMapping(value="/returnBook", consumes = "application/json")
    public void returnBook(@RequestParam int bid,@RequestParam int uid){
        st.returnBook(bid,uid);

    }


    @GetMapping(value = "/mostPopBook", produces = "application/json")
    public Book mostPopBook(){
        return st.mostPopularBook();
    }

    @GetMapping(value = "/userwithMPBook", produces = "application/json")
    public User userMostBooks(){
        return st.userWithMostBooks();

}
