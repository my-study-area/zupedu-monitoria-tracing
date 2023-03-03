package br.com.zup.edu.personmanager.error;

import br.com.zup.edu.personmanager.model.PessoaInexistenteException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class ErrorHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = {Exception.class})
    protected ResponseEntity<?> handler(Exception e, WebRequest request){

        var error = new ErrorResponse(LocalDateTime.now().toString(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getClass().toString(),
                e.getLocalizedMessage() , request.getContextPath());

        logger.error("Erro não esperado");
        return ResponseEntity.internalServerError().body(error);
    }

    @ExceptionHandler(value = {PessoaInexistenteException.class})
    protected ResponseEntity<?> handler(PessoaInexistenteException e, WebRequest request){

        var error = new ErrorResponse(LocalDateTime.now().toString(),
                HttpStatus.UNPROCESSABLE_ENTITY.value(), e.getClass().toString(),
                e.getLocalizedMessage() , request.getContextPath());
        logger.error("Pessoa não cadastrada");
        return ResponseEntity.unprocessableEntity().body(error);
    }

}
