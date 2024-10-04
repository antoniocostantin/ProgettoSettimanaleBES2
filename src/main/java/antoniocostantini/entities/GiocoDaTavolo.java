package antoniocostantini.entities;

import java.util.Random;

public class GiocoDaTavolo extends Gioco{
    private int id;
    private String titolo;
    private int annoDiPublicazione;
    private double prezzo;
    private int numGiocatori;
    private int durataGiocoInMin;

    public GiocoDaTavolo(String titolo, int annoDiPublicazione, double prezzo, int numGiocatori, int durataGiocoInMin) {
        Random rand  = new Random();

        this.id = rand.nextInt(9999999) + 1;
        this.titolo = titolo;
        this.annoDiPublicazione = annoDiPublicazione;
        this.prezzo = prezzo;
        this.numGiocatori = numGiocatori;
        this.durataGiocoInMin = durataGiocoInMin;
    }
    //getter

    @Override
    public String toString() {
        return "GiocoDaTavolo{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoDiPublicazione=" + annoDiPublicazione +
                ", prezzo=" + prezzo +
                ", numGiocatori=" + numGiocatori +
                ", durataGiocoInMin=" + durataGiocoInMin +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoDiPublicazione() {
        return annoDiPublicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getNumGiocatori() {
        return numGiocatori;
    }

    public int getDurataGiocoInMin() {
        return durataGiocoInMin;
    }

    //setter


    public void setId(int id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAnnoDiPublicazione(int annoDiPublicazione) {
        this.annoDiPublicazione = annoDiPublicazione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setNumGiocatori(int numGiocatori) {
        this.numGiocatori = numGiocatori;
    }

    public void setDurataGiocoInMin(int durataGiocoInMin) {
        this.durataGiocoInMin = durataGiocoInMin;
    }
}
