package com.kstore.venda.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Venda {

    private Long idUsuario;
    private Long idProduto;
    private Long quantidade;
    private Double valor;

    public Venda(Long idUsuario, Long idProduto, Long quantidade) {
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }
}
