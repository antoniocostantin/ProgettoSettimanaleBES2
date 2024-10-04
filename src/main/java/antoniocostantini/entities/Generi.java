package antoniocostantini.entities;

import java.util.Random;

public enum Generi {
    ARACDE,
    AZIONE,
    SPORT,
    AVVENTURA,
    PICCHIADURO,
    FPS,
    RPG;

    public static String getRandGenere (){
        Random rand = new Random();
    Generi[] values = Generi.values();
        return values[rand.nextInt(values.length)].toString();
    }
}
