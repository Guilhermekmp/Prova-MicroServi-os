package com.kstore.venda.controler;

import com.kstore.venda.entity.Venda;
import com.kstore.venda.service.VendaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venda")
@RequiredArgsConstructor
@Tag(name = "Enpoint de Venda")
public class VendaControler {

    private final VendaService service;

    @PostMapping
    @RequestMapping("/buy/{idUser}/{idProduto}/{quantity}")
    @Operation(summary = "Realiza uma compra")
    public ResponseEntity<Venda> buy(@PathVariable("idUser") Long idUser,
                                     @PathVariable("idProduto") Long idProduto,
                                     @PathVariable("quantity") Long quantity) {
        return ResponseEntity.ok(service.buy(idUser, idProduto, quantity));
    }
}
