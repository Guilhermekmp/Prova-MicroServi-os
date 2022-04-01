package com.kstore.estoque.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Produto {

    private AtomicLong id = new AtomicLong();

    private String name;

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    private Double price;
}
