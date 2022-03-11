package com.example.LibraryManagement.Repository;
import com.example.LibraryManagement.Dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDb extends CrudRepository<User,Integer> {

}
