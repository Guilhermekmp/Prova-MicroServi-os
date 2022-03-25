package com.kstore.estoque.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estoque")
public class EstoqueControler {

    @GetMapping
    public String test() {
        return "Calling Service Estoque";
    }
}
