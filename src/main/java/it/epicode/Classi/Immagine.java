package it.epicode.Classi;

import it.epicode.ElementoMultimediale;

import java.util.Scanner;

import static it.epicode.Main.PlayerMultimediale.mostraLista;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    //Costruttore che estende la classe padre ElementoMultimediale
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {

        luminosita++;

    }

    public void diminuisciLuminosita() {
        if(luminosita == 0) {
            luminosita++;
        }
        luminosita--;
    }



    public void show() {
        System.out.println("Titolo: " + titolo + " " + "Luminosità: "+ "*".repeat(luminosita));
        System.out.println("Aumenta la luminosita con + o diminuisci con -");
        Scanner scanner = new Scanner(System.in);
        char scelta = scanner.next().charAt(0);
        if (scelta == '+') {
            System.out.println("Luminosità aumentata");
            aumentaLuminosita();
            System.out.println();
            show();
        } else if (scelta == '-') {
            System.out.println("Luminosità diminuita");
            diminuisciLuminosita();
            System.out.println();
            show();
        }else if(scelta != '+' || scelta != '-' ){
            System.out.println("Hai scelto di tornare alla lista dei file");
            System.out.println();
            mostraLista();
        }

    }

    @Override
    public void riproduci() {
        show();
    }
}
