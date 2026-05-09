package com.prashant.journalApp.service;

import com.prashant.journalApp.entity.JournalEntry;
import com.prashant.journalApp.entity.User;
import com.prashant.journalApp.repository.JournalEntryRepository;
import com.prashant.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
            userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}