package com.example.masai_clander.repostory;

import com.example.masai_clander.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
@EnableJpaRepositories
public interface UserRepostory extends JpaRepository<User,Integer> {
    public List<User>findByUserName(String name);
}
