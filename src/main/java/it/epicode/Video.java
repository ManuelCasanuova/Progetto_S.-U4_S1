package it.epicode;

public class Video extends ElementoMultimediale implements Riproducibile{
    private int luminosita;
    private int volume;
    private int durata;


    public Video(String titolo, int luminosita, int volume, int durata) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
        this.durata = durata;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        volume--;
    }

    @Override
    public void play() {

    }
}
