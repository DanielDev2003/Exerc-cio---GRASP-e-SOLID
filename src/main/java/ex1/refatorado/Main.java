package main.java.ex1.refatorado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        Item i1 = new Item("Iphone XR", 1800, 1);
        Item i2 = new Item("Ipod", 1400, 3);
        items.add(i1);
        items.add(i2);

        Pedido p1 = new Pedido(items, new Cartao(), 1);
        
        SistemaPedidos s = new SistemaPedidos(new PesistenciaPostgres());
        s.processarPedido(p1);

    }
}
