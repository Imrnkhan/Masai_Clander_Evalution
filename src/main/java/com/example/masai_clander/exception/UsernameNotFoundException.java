package com.example.masai_clander.exception;

public class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException(){

    }
    public UsernameNotFoundException(String msg){
        super(msg);
    }
}
