package com.kstore.venda.service;

import com.kstore.venda.entity.Venda;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VendaService {

    public Venda buy(Long idUser, Long idProduct, Long quantity){
        log.info("Realizando compra");
        return new Venda(idUser,idProduct,quantity);
    }
}
