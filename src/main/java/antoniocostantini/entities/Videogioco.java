package antoniocostantini.entities;


import java.util.Random;

public class Videogioco extends Gioco{
    private String piattaforma;
    private int duratainOre;
    private Generi genere;
    private int id;
    private String titolo;
    private int annoDiPublicazione;
    private double prezzo;



    public Videogioco(String titolo, Generi genere, double prezzo, String piattaforma, int duratainOre, int annoDiPublicazione) {
        Random rand = new Random();

        this.titolo = titolo;
        this.annoDiPublicazione = annoDiPublicazione;
        this.prezzo = prezzo;
        this.id = rand.nextInt(9999999) + 1;
        this.duratainOre = duratainOre;
        this.piattaforma = piattaforma;
        this.genere = genere;
    }

    //getter


    public String getPiattaforma() {
        return piattaforma;
    }

    public int getDuratainOre() {
        return duratainOre;
    }

    public Generi getGenere() {
        return genere;
    }

    public int getId() {
        return id;
    }

    public int getAnnoDiPublicazione() {
        return annoDiPublicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    // setter


    @Override
    public String toString() {
        return "Videogioco{" +
                "piattaforma='" + piattaforma + '\'' +
                ", duratainOre=" + duratainOre +
                ", genere=" + genere +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoDiPublicazione=" + annoDiPublicazione +
                ", prezzo=" + prezzo +
                '}';
    }

    public void setDuratainOre(int duratainOre) {
        this.duratainOre = duratainOre;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public void setGenere(Generi genere) {
        this.genere = genere;
    }

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
}
