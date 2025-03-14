package it.epicode.Classi;

import it.epicode.ElementoMultimediale;
import it.epicode.Riproducibile;

import java.util.Scanner;

import static it.epicode.Main.PlayerMultimediale.mostraLista;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int durata;

    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {

        if(volume==0){
            volume++;
        }
        volume--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println( "Titolo:" + titolo + " " + "Volume: " + "!".repeat(volume));}
            System.out.println("Aumenta il volume con + o diminuisci con -, oppure premi 0 per tornare alla lista dei file");
            Scanner scanner = new Scanner(System.in);
            char scelta = scanner.next().charAt(0);
            if (scelta == '+') {
                System.out.println("Volume alzato");
                alzaVolume();
                System.out.println();
                play();
            } else if (scelta == '-') {
                System.out.println("Volume abbassato");
                abbassaVolume();
                System.out.println();
                play();
            }else {
                System.out.println("Hai scelto di tornare alla lista dei file");
                System.out.println();
                mostraLista();
            }
        }


    @Override
    public void riproduci() {
        play();
    }
}
