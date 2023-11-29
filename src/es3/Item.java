package es3;

import java.util.Random;

public class Item {
    private int codiceArticolo;
    private String descrizioneArticolo = "";
    private double prezzo;
    private int pezziDisponibili;

    public Item(double price, int pieces){
        Random rnd =  new Random();
        this.codiceArticolo = rnd.nextInt(10000,99999);
        this.prezzo = price;
        this.pezziDisponibili = pieces;
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }
}
