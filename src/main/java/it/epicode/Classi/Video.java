package it.epicode.Classi;

import it.epicode.ElementoMultimediale;
import it.epicode.Riproducibile;

import java.util.Scanner;

import static it.epicode.Main.PlayerMultimediale.mostraLista;

public class Video extends ElementoMultimediale implements Riproducibile {
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
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < durata; i++) {
            System.out.println("Titolo : " +titolo + " " + "Volume: " +  "!".repeat(volume) + " " + "Luminosità: " + "*".repeat(luminosita) );}
            System.out.println();
            System.out.println("Puoi decidere di aumentare o abbassare il volume e la luminosità");
            System.out.println("Seleziona 1 per volume e 2 per luminosità, oppure 0 per tornare alla lista dei file");


            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {

                case 1:
                    System.out.println("Aumenta il volume con + o diminuisci con -, oppure 0 per tornare alla lista dei file");
                    char volume = scanner.next().charAt(0);
                    if (volume == '+') {
                        System.out.println("Volume alzato");
                        alzaVolume();
                        System.out.println();
                        play();
                    } else if (volume == '-') {
                        System.out.println("Volume abbassato");
                        abbassaVolume();
                        System.out.println();
                        play();
                    }
                    break;


                case 2:
                    System.out.println("Aumenta la luminosità con + o diminuisci con -, oppure 0 per tornare alla lista dei file");
                    char luminosita = scanner.next().charAt(0);
                    if (luminosita == '+') {
                        System.out.println("Luminosità aumentata");
                        aumentaLuminosita();
                        System.out.println();
                        play();
                    } else if (luminosita == '-') {
                        System.out.println("Luminosità diminuita");
                        diminuisciLuminosita();
                        System.out.println();
                        play();
                    }
                    break;

                default:
                    System.out.println("Hai scelto di uscire e di tornare alla lista dei file");
                    System.out.println();
                    mostraLista();
                    break;
            }


    }


    @Override
    public void riproduci() {
        play();
    }
}
