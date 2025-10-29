import java.util.Scanner;

public class ProsjekOcjena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brojOcjena = 0;
        int sumaOcjena = 0;
        double prosjekOcjena = 0d;

        System.out.println("Upišite broj ocjena koje želite upisati: ");
        brojOcjena = Integer.parseInt(sc.nextLine());
        int[] ocjene = new int[brojOcjena];

        for (int i = 0; i < ocjene.length; i++) {
            int redniBroj = i + 1;
            int ocjena = 0;
            System.out.println("Upišite " + redniBroj + ". ocjenu: " );
            ocjena = Integer.parseInt(sc.nextLine());
            ocjene[i] = ocjena;
            sumaOcjena += ocjena;
        }

        prosjekOcjena = (double) sumaOcjena / brojOcjena;

        System.out.println("Prosjek ocjena je: " + prosjekOcjena);
    }
}
