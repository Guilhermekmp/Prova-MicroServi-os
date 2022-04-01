package com.kstore.login.web;

import com.kstore.login.service.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
@Tag(name = "Login")
public class LoginControler {

    private final LoginService service;

    @RequestMapping("/sing-in/{login}/{senha}")
    @PostMapping
    @Operation(summary = "Logar usuario no sistema")
    public ResponseEntity<Boolean> singIn(@PathVariable("login") String login,
                                          @PathVariable("senha") String senha
    ){
        return ResponseEntity.ok(service.singIn(login,senha));
    }


    @RequestMapping("/sing-up/{login}/{senha}")
    @PostMapping
    @Operation(summary = "Cadastrar usuario no sistema")
    public ResponseEntity<Boolean> singUp(@PathVariable("login") String login,
                                          @PathVariable("senha") String senha
    ){
        return ResponseEntity.ok(service.singUp(login, senha));
    }
}
