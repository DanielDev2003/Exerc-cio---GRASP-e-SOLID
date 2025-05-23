package main.java.ex1.refatorado;

import java.util.ArrayList;
import java.util.List;

public class PesistenciaPostgres implements Repository{
    List<Pedido> pedidos = new ArrayList<>();
    @Override
    public void save(Pedido p){
        pedidos.add(p);
        System.out.println("Salvando no Postgres com o ID: " + p.getId());
    }
}   
