package main.java.ex1.refatorado;

public class SistemaPedidos {
    private Repository repository;
    public SistemaPedidos(Repository repository) {
        this.repository = repository;
    }
    
    public void processarPedido(Pedido p){
        p.calcularTotal();
        p.formaPagamento();
        repository.save(p);
    }

}
