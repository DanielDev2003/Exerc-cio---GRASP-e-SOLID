package main.java.ex1.refatorado;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedido {
    private List<Item> items = new ArrayList<>();
    private int id;
    private int total;
    private FormaPagamento formaPagamento;

    
    public Pedido(List<Item> items, FormaPagamento formaPagamento, int id) {
        this.items = items;
        this.total = 0;
        this.formaPagamento = formaPagamento;
        this.id = id;
    }

    public void calcularTotal(){
        for(Item item : items){
            this.total += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Total dos Items: " + total);
    }

    public void formaPagamento(){
        formaPagamento.formaPagamento();
    }

    public List<Item> getItems() {
        return items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId(){
        return this.id;
    }
}
