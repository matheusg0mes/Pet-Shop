package br.com.petshop.petshop.domin.exceptions.exception;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String msg){
        super(msg);
    }
}
