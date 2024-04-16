package com.exercice.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercice.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

    List<User> findAllByDeletedAtNull();

}
