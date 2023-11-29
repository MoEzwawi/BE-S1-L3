package es3;

public class Cart {
    private Customer cliente;
    private Item[] articoliAggiunti;
    private double totale;

    public Cart(Customer tizio){
        this.cliente = tizio;
    }
}
