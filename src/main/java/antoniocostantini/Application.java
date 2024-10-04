package antoniocostantini;

import antoniocostantini.entities.Generi;
import antoniocostantini.entities.Gioco;
import antoniocostantini.entities.GiocoDaTavolo;
import antoniocostantini.entities.Videogioco;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class  Application {

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random rand = new Random();
        List<Gioco> listaGiochi = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(rand.nextBoolean()){
                String titolo = faker.book().title();
                String[] piattaforme = {"playstation","Xbox","Nintendo","SEGA"};
                Generi[] generi = Generi.values();
                Videogioco vid = new Videogioco(titolo,generi[rand.nextInt(generi.length)], rand.nextDouble(200) + 1,piattaforme[rand.nextInt(piattaforme.length)], rand.nextInt(40) + 1, rand.nextInt(1950, 2025));
                listaGiochi.add(vid);
            } else {
                String titolo = faker.book().title();
                GiocoDaTavolo gioco = new GiocoDaTavolo(titolo, rand.nextInt(-2000,2025), rand.nextDouble(200) + 1, rand.nextInt(2, 11), rand.nextInt(20,500));
                listaGiochi.add(gioco);
            }
        }

        listaGiochi.forEach(g -> { if(g instanceof Videogioco videogame){
            System.out.println(videogame);
        } else if (g instanceof GiocoDaTavolo gioco){
            System.out.println(gioco);
        }
        });
    }
}
