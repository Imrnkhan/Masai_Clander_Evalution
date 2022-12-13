package com.example.masai_clander.exception;

public class MobileAlredayExist extends RuntimeException {
    public MobileAlredayExist(){

    }
    public MobileAlredayExist(String msg){
        super(msg);
    }
}
