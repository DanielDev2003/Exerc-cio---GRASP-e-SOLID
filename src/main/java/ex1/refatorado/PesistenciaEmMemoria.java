package main.java.ex1.refatorado;

import java.util.ArrayList;
import java.util.List;

public class PesistenciaEmMemoria implements Repository {
    List<Pedido> pedidos = new ArrayList<>();
    @Override
    public void save(Pedido p){
        pedidos.add(p);
        System.out.println("Pedido Salvo na memoria com o ID: " + p.getId());
    }
}
