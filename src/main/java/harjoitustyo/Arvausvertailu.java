package harjoitustyo;

/**
 * tämä luokka vertaa käyttäjän tekstikenttään syöttämää nimeä eli arvausta pelin oikeaan nimeen
 */
public class Arvausvertailu {

    public Listatiedot listatiedot;

    public void ArvausVertailu(Listatiedot listatiedot) {
        this.listatiedot = listatiedot;
    }

    public void Arvaus(String arvaus) {

        if (arvaus != null && arvaus.equals(listatiedot.getNimi())) {

        }
    }
}
