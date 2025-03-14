package it.epicode.Main;

import it.epicode.ElementoMultimediale;
import it.epicode.Classi.Immagine;
import it.epicode.Classi.RegistrazioneAudio;
import it.epicode.Classi.Video;

import java.util.Scanner;

public class PlayerMultimediale {




    public static void mostraLista() {
        int selezione;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Quale file vuoi riprodurre?");
            System.out.println("1: "+ elementi[0].getTitolo());
            System.out.println("2: "+ elementi[1].getTitolo());
            System.out.println("3: "+ elementi[2].getTitolo());
            System.out.println("4: "+ elementi[3].getTitolo());
            System.out.println("5: "+ elementi[4].getTitolo());
            System.out.println("0: Esci dal player");
            System.out.println();
            selezione = scanner.nextInt();
            scanner.nextLine();
            if (selezione >= 1 && selezione<= 5 ){
                elementi[selezione-1].riproduci();
            }
        } while (selezione != 0);
    }


    static ElementoMultimediale[] elementi = new ElementoMultimediale[5];



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println();
        System.out.println("                       ###############################");
        System.out.println();
        System.out.println("                       Benvenuto nel tuo Media Player");
        System.out.println();
        System.out.println("                       ###############################");
        System.out.println();


        for (int i = 0; i < 5; i++) {

            System.out.println();
            System.out.println();
            System.out.println("Inserisci il tipo di elemento (1=Immagine, 2=Audio, 3=Video):");
            System.out.println();

            int tipo = scanner.nextInt();
            scanner.nextLine();


            switch (tipo) {
                case 1:
                    System.out.println("Hai selezionato un IMMAGINE");
                    System.out.println("Inserisci il titolo dell'IMMAGINE: ");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosita);
                    System.out.println("Immagine " + titolo + " creata con successo ");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Hai selezionato un file AUDIO");
                    System.out.println("Inserisci il titolo del tuo file AUDIO: ");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Inserisci il volume:");
                    int volumeAudio = scanner.nextInt();
                    System.out.println("Inserisci la durata:");
                    int durataAudio = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titoloAudio, volumeAudio, durataAudio);
                    System.out.println("Audio " + titoloAudio + " creato con successo ");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hai selezionato un VIDEO");
                    System.out.println("Inserisci il titolo del tuo VIDEO: ");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminositaVideo = scanner.nextInt();
                    System.out.println("Inserisci la durata:");
                    int durataVideo = scanner.nextInt();
                    elementi[i] = new Video(titoloVideo, volumeVideo, luminositaVideo, durataVideo);
                    System.out.println("Video " + titoloVideo + " creato con successo ");
                    System.out.println();
                    break;
                default:
                    System.out.println("Ha scelto un tipo di file multimediale non valido, riprova.");
                    i--;
                    break;
            }
        }
    mostraLista();


    }
}
