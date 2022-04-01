package com.kstore.estoque.service;

import com.kstore.estoque.entity.Estoque;
import com.kstore.estoque.entity.Produto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EstoqueService {

    public Boolean addProduct(String name, Double price ){
        Produto newProduct = new Produto(name, price);
        newProduct.getId().incrementAndGet();
        Estoque.getInstance().getProdutoList().add(newProduct);
        return true;
    }

    public Boolean removeProduct(Long idProduct){
        Estoque.getInstance().getProdutoList().remove(idProduct);
        return true;
    }
}
