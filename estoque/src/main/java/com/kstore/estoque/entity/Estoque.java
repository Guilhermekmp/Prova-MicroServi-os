package com.kstore.estoque.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estoque {

    private List<Produto> produtoList  = new ArrayList<Produto>();
    private static Estoque instance;

    public static Estoque getInstance(){
        if(Objects.isNull(instance)){
            instance = new Estoque();
        }
        return instance;
    }

}
