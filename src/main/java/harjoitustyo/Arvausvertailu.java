package harjoitustyo;

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
