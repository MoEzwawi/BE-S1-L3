package es3;

import java.util.Date;
import java.util.Random;

public class Customer {
    private int codiceCliente;
    private String nomeCliente;
    private String cognomeCliente;
    private String emailCliente;
    private Date dataIscrizione;
    public Customer(String name, String surname, String email){
        Random rnd =  new Random();
        this.codiceCliente = rnd.nextInt(10000,99999);
        this.nomeCliente = name;
        this.cognomeCliente = surname;
        this.emailCliente = email;
    }
}
