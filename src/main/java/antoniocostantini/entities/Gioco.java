package antoniocostantini.entities;




public abstract class Gioco {
    private int id;
    private String titolo;
    private int annoDiPublicazione;
    private double prezzo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoDiPublicazione() {
        return annoDiPublicazione;
    }

    public void setAnnoDiPublicazione(int annoDiPublicazione) {
        this.annoDiPublicazione = annoDiPublicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
