package com.example.LibraryManagement.Service;

import com.example.LibraryManagement.Dto.Book;
import com.example.LibraryManagement.Dto.User;
import com.example.LibraryManagement.Dto.UserBookHistoryPojo;
import com.example.LibraryManagement.Entity.Books;
import com.example.LibraryManagement.Entity.UserBookHistoryEntity;
import com.example.LibraryManagement.Repository.BooksDb;
import com.example.LibraryManagement.Repository.UserBookHistory;
import com.example.LibraryManagement.Repository.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceImp implements com.example.LibraryManagement.Service.Service {

    @Autowired
    BooksDb booksDb;

    @Autowired
    UserDb userDb;

    @Autowired
    UserBookHistory history;

    @Override
    public void addUser(User u){
        userDb.save(new User(u.getId(),u.getName(),u.getAddress(),u.getPhoneNo()));
    }

    @Override
    public void addBook(Book b){
        booksDb.save(new Books(b.getId(),b.getName(),b.getWriter(),b.getSummary(),b.getCategory()));
    }
    @Override
    public void issueBook(int bid,int uid){

        Iterable<UserBookHistoryEntity>list=history.findAll();
        for(UserBookHistoryEntity ubh:list){
            if(ubh.getBid()==bid){
                if(ubh.getStartDate()!=null&&ubh.getEndDate()==null){
                    return;
                }
                else{
                    history.save(new UserBookHistoryEntity(ubh.getUid(),ubh.getBid(),java.time.LocalDate.now().toString()));
                }
            }
        }

    }

    @Override
    public void returnBook(int uid,int bid){
        Iterable<UserBookHistoryEntity>list=history.findAll();
        for(UserBookHistoryEntity ubh:list){
            if(ubh.getBid()==bid){
                if(ubh.getStartDate()!=null&&ubh.getEndDate()==null){
                    return;
                }
                else{
                    ubh.setEndDate(java.time.LocalDate.now().toString());
                }
            }
        }
    }
    @Override
    public Books mostPopularBook(){
        Iterable<UserBookHistoryEntity> listForMax = history.findAll();
        Map<Long, Integer> map = new HashMap<>();
        for(UserBookHistoryEntity Book1: listForMax){
            map.put(Book1.getBid(), map.getOrDefault(Book1.getBid(), 0) + 1);
        }

        int maxId = 0;
        Long getMaxBookId = 0L;
        for(Long Bookid : map.keySet()){
            if(map.get(Bookid) > maxId){
                maxId = map.get(Bookid);
                getMaxBookId = Bookid;
            }
        }

        Iterable<Book> listToGetPopBook = BooksDb.findAll();
        for(Books books : listToGetPopBook){
            if(getMaxBookId==books.getId()){
                return new Books(books.getId(), books.getName(),books.getWriter(),books.getSummary(),books.getCategory());
            }
        }
        return null;
    }

    @Override
    public User userWithMostBooks(){
        Iterable<UserBookHistoryEntity> listForMax = history.findAll();
        Map<Long, Integer> map = new HashMap<>();
        for(UserBookHistoryEntity user1: listForMax){
            map.put(user1.getUid(), map.getOrDefault(user1.getUid(), 0) + 1);
        }

        int maxId = 0;
        Long getMaxUserId = 0L;
        for(Long Userid : map.keySet()){
            if(map.get(Userid) > maxId){
                maxId = map.get(Userid);
                getMaxUserId = Userid;
            }
        }

        Iterable<User> listToGetPopBook = UserDb.findAll();
        for(User users : listToGetPopBook){
            if(getMaxUserId==users.getId()){
                return new User(users.getId(),users.getName(),users.getAddress(),users.getPhoneNo());
            }
        }

        return null;
    }

}
