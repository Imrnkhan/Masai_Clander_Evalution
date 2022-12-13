package com.example.masai_clander.services;

import com.example.masai_clander.Model.User;
import com.example.masai_clander.exception.MobileAlredayExist;
import com.example.masai_clander.repostory.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserserviceImpl implements UserService {

    @Autowired
    Userdao userdao;
    @Override
    public boolean createUser(User user) {
        Optional<User> opt = userdao.findByMobile(user.getMobile());
        if(opt.isPresent()){
            throw new MobileAlredayExist("user alredy resiter this number");
        }else {
            userdao.save(user);
        }
        return false;
    }



    @Override
    public User findUserById(Integer id) {
        Optional<User> otp = userdao.findById(id);
        if(otp.isPresent()){
            return otp.get();
        }

        throw new UsernameNotFoundException("user not found this id");

    }

    @Override
    public List<User> findAllUser() {
        List<User> opt = userdao.findAll();
        if(opt.size()!=0){
            return opt;
        }
        throw new UsernameNotFoundException("user not found this system");
    }

    @Override
    public boolean deleteUser(Integer id) {
        Optional<User> opt = userdao.findById(id);
        if(opt.isPresent()){
            userdao.delete(opt.get());
            return true;
        }
        throw new UsernameNotFoundException("user not exist this id");
    }

    @Override
    public boolean updateUser(int id) {
        return false;
    }
}
