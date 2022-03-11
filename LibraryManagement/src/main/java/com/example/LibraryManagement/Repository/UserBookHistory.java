package com.example.LibraryManagement.Repository;

import com.example.LibraryManagement.Dto.UserBookHistoryPojo;
import com.example.LibraryManagement.Entity.UserBookHistoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBookHistory extends CrudRepository<UserBookHistoryEntity,Integer> {
}
