package com.spring.library.services;

import com.spring.library.models.User;
import com.spring.library.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAllUsers(){
        return repository.findAll();
    }

    public Optional<User> findUserById(Long id){
        var user = repository.findById(id);
        if(user.isPresent()) return user;
        else {
            System.out.println("Usuario não encontrado");
            return null;
        }
    }

    public User saveUser(User user) {
        return repository.save(user);
    }
    public User updateUser(User user) {
        var dbUser = repository.findById(user.getId());
        if( dbUser != null && !dbUser.isEmpty()) {
            return repository.save(user);
        }
        return null;
    }

    public void deleteUser(Long id) {
        var user = repository.findById(id);
        if( user != null && !user.isEmpty()) {
            repository.deleteById(id);
        }
    }

}
