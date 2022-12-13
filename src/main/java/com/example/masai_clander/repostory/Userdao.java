package com.example.masai_clander.repostory;

import com.example.masai_clander.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Userdao extends JpaRepository<User,Integer> {
    Optional<User>findByMobile(String mob);
}
