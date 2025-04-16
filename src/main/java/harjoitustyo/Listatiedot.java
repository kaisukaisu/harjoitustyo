package harjoitustyo;

import javafx.scene.image.Image;

public class Listatiedot {
    public final int indeksi;
    public final String nimi;
    public final Image kuva;

    public Listatiedot(int indeksi, String nimi, Image kuva) {
        this.indeksi = indeksi;
        this.nimi = nimi;
        this.kuva = kuva;
    }

    public int getIndeksi() {
        return indeksi;
    }

    public String getNimi() {
        return nimi;
    }

    public Image getKuva() {
        return kuva;
    }
}
