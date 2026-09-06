package br.com.petshop.petshop.domin.exceptions.handle;

import br.com.petshop.petshop.domin.exceptions.exception.CustomMenagerException;
import br.com.petshop.petshop.domin.exceptions.exception.InternarServerErroException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class HandlerGlobalException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InternarServerErroException.class)
    public ResponseEntity<CustomMenagerException> erro(InternarServerErroException ex, WebRequest request){

        CustomMenagerException response = new CustomMenagerException(
                new Date(),
                ex.getMessage(),
                request.getDescription(false)
                );
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatusCode status,
            WebRequest request) {
        Map<String,String> erros = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(erro ->
                erros.put(erro.getField(), erro.getDefaultMessage()));

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);
    }
}
