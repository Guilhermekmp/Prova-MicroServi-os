package com.kstore.estoque.web;

import com.kstore.estoque.entity.Estoque;
import com.kstore.estoque.entity.Produto;
import com.kstore.estoque.service.EstoqueService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estoque")
@RequiredArgsConstructor
@Tag(name = "Endpoints Estoque")
public class EstoqueControler {

    private final EstoqueService service;

    @GetMapping
    @RequestMapping("/produtos")
    @Operation(summary = "Retorna lista de produtos.")
    public ResponseEntity<List<Produto>> getProducts(){
        return ResponseEntity.ok(Estoque.getInstance().getProdutoList());
    }

    @PostMapping
    @RequestMapping("/produtos/{id}")
    @Operation(summary = "Deleta um produto do Estoque via id.")
    public ResponseEntity<Boolean> deleteProduct(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.removeProduct(id));
    }
}
