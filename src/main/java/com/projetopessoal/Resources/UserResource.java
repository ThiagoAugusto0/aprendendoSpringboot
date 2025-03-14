package com.projetopessoal.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.projetopessoal.Entidades.*;



@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User>findAll(){
        User u = new User(1L,"Thiago", "thiagocaldeira@gmail.com", "123", "999999999");
        return ResponseEntity.ok().body(u);
    }
}
