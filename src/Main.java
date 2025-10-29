import java.util.Arrays;

public class Main {
    public static void main(KlasaString[] args) {

        int[] brojevi = new int[5]; // Inicijalizacija polja. Svi elementi polja imaju defaultnu vrijednost tipa podatka

        // Upisivanje podataka u polje na točno određeni indeks / adresu elementa u polju
        brojevi[0] = 1;
        brojevi[1] = 12;
        brojevi[2] = 22;
        brojevi[3] = 9;
        brojevi[4] = 5;

        // brojevi[5] = 33; // Greška jer polje nema navedeni index

        Arrays.sort(brojevi);
//        Arrays.fill(brojevi,3);

        /*for (int i : brojevi) {
            System.out.println(i);
        }*/

//        System.out.println(brojevi[2]);

        // System.out.println(brojevi[5]); // Greška jer polje nema navedeni index

        /*for (int i = 0; i < brojevi.length; i++){
            System.out.println(brojevi[i]);
        }*/

        // Ispis elemenata polja unatrag - od zadnjeg elementa prema prvom
        for (int i = brojevi.length - 1; i >= 0; i--) {
            System.out.println(brojevi[i]);
        }



    }
}