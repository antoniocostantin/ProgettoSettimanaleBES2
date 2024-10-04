package antoniocostantini.entities;

import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collezione {
    List<Gioco> listaGiochi;


    public Collezione(List<Gioco> listaGiochi) {
        this.listaGiochi = listaGiochi;

    }

    public void addGioco(Gioco g) {
        if(listaGiochi.stream().anyMatch(gioco -> gioco.getId() == g.getId()))
            listaGiochi.add(g);
        else System.out.println("Errore: id del gioco già presente");
    }

    public Gioco getGiocoById(int id) {
        Gioco g = listaGiochi.stream().filter(gioco -> gioco.getId() == id).findFirst().orElse(null);
        return g instanceof Videogioco ? (Videogioco) g : (GiocoDaTavolo) g;
    }


    public List<Gioco> getGiochiByPrice(double price) {
        return listaGiochi.stream().filter(gioco -> gioco.getPrezzo() < price).toList();
    }

    public List<Gioco> getGiochiBynumeroGiocatori(int numeroGiocatori) {
        return listaGiochi.stream().filter(g -> g instanceof GiocoDaTavolo).filter(fg -> ((GiocoDaTavolo) fg).getNumGiocatori() == numeroGiocatori).toList();
    }

    public void deleteById(int id) {
        listaGiochi.stream().filter(gioco -> gioco.getId() == id).forEach(gioco -> listaGiochi.remove(gioco));
    }

    public void update(Gioco g, int id) {
        int indice = listaGiochi.stream().filter(gioco -> gioco.getId() == id).findFirst().get().getId();
        listaGiochi.set(indice, g);
    }

    public void Stats(){
        List<Videogioco> videogiochi = listaGiochi.stream().filter(g -> g instanceof Videogioco).map(g -> (Videogioco) g).toList();
        List<GiocoDaTavolo> giochiDaTavolo = listaGiochi.stream().filter(g -> g instanceof GiocoDaTavolo).map(g -> (GiocoDaTavolo) g).toList();
        DoubleSummaryStatistics stats = listaGiochi.stream().mapToDouble(Gioco::getPrezzo).summaryStatistics();
        Gioco expencier = listaGiochi.stream().filter(g -> g.getPrezzo() == stats.getMax()).findFirst().get();
        System.out.println("tot giochi da tavolo = " + giochiDaTavolo.size() +"; tot videogames = " + videogiochi.size() + "; gioco più costoso = " + expencier + "; media prezzi = " + stats.getAverage());

    }
}
