import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        String odabranaOpcija = "";
        String brojZaProvjeru = "";
        String prviBrojIntervala = "";
        String drugiBrojIntervala = "";
        String savrseniBrojevi = "";
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ovaj program ima dvije mogućnosti:\n\t1. Provjerava je li upisani pozitivni cijeli broj savršen\n\t2. Ispisuje sve savršene brojeve u definiranom intervalu pozitivnih cijelih brojeva.\n");
        System.out.print("Odaberite jednu od dviju ponuđenih mogućnosti (upišite broj 1 ili broj 2): ");

        odabranaOpcija = sc.nextLine();

        while(!(odabranaOpcija.equals("1") || odabranaOpcija.equals("2"))){
            System.out.print("\nGreška u radu. Neispravan odabir mogućnosti!\nOdaberite jednu od dviju ponuđenih mogućnosti (upišite broj 1 ili broj 2): ");
            odabranaOpcija = sc.nextLine();
        }

        if(odabranaOpcija.equals("1")){
            System.out.print("\nUpišite pozitivni cijeli broj za kojeg želite provjeriti je li savršen ili nije: ");
            brojZaProvjeru = sc.nextLine();

            while(!isNumeric(brojZaProvjeru) || (brojZaProvjeru.charAt(0) == '-')) {
                System.out.print("\nGreška u radu. Uneseni podatak nije pozitivni cijeli broj!\nUpišite pozitivni cijeli broj za kojeg želite provjeriti je li savršen ili nije: ");
                brojZaProvjeru = sc.nextLine();
            }

            int intBrojZaProvjeru = Integer.parseInt(brojZaProvjeru);

            if(isPerfect(intBrojZaProvjeru)) {
                System.out.println("Upisani broj (" + intBrojZaProvjeru + ") je savršen broj!");
            } else{
                System.out.println("Upisani broj (" + intBrojZaProvjeru + ") nije savršen broj!");
            }

        } else if(odabranaOpcija.equals("2")){
            System.out.print("\nUpišite pozitivni cijeli broj početka intervala brojeva: ");
            prviBrojIntervala = sc.nextLine();

            while(!isNumeric(prviBrojIntervala) || (prviBrojIntervala.charAt(0) == '-')){
                System.out.print("\nGreška u radu. Uneseni podatak nije pozitivni cijeli broj!\nUpišite pozitivni cijeli broj početka intervala brojeva: ");
                prviBrojIntervala = sc.nextLine();
            }

            int intPrviBrojIntervala = Integer.parseInt(prviBrojIntervala);

            System.out.print("\nUpišite pozitivni cijeli broj kraja intervala brojeva: ");
            drugiBrojIntervala = sc.nextLine();
            int intDrugiBrojIntervala = 0;

            while(intPrviBrojIntervala >= intDrugiBrojIntervala) {
                while (!isNumeric(drugiBrojIntervala) || (drugiBrojIntervala.charAt(0) == '-')) {
                    System.out.print("\nGreška u radu. Uneseni podatak nije pozitivni cijeli broj!\nUpišite pozitivni cijeli broj kraja intervala brojeva: ");
                    drugiBrojIntervala = sc.nextLine();
                }
                intDrugiBrojIntervala = Integer.parseInt(drugiBrojIntervala);
                if(intPrviBrojIntervala >= intDrugiBrojIntervala){
                    System.out.print("\nGreška u radu. Uneseni kraj intervala mora biti veći od početka intervala!\nUpišite pozitivni cijeli broj kraja intervala brojeva: ");
                    drugiBrojIntervala = sc.nextLine();
                }
            }

            for (int i = intPrviBrojIntervala; i <= intDrugiBrojIntervala ; i++) {
                if(isPerfect(i)){
                    if(count == 0){
                        savrseniBrojevi = Integer.toString(i);
                    } else{
                        savrseniBrojevi += ", " + i;
                    }
                    count += 1;
                }
            }



            if(count == 0){
                System.out.println("U definiranom intervalu od " + prviBrojIntervala + " do " + drugiBrojIntervala + " nema savršenih brojeva!");
            } else if(count == 1){
                System.out.println("U definiranom intervalu od " + prviBrojIntervala + " do " + drugiBrojIntervala + " savršeni broj je: " + savrseniBrojevi + "!");
            } else{
                System.out.println("U definiranom intervalu od " + prviBrojIntervala + " do " + drugiBrojIntervala + " savršeni brojevi su: " + savrseniBrojevi + "!");
            }

        } else{
            System.out.println("Došlo je do nepredviđene greške u radu! Ukoliko se greška i dalje bude javljala kontaktirajte Administratora.");
        }

    }



    private static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }


    private static boolean isPerfect(int broj){
        int sumaDjelitelja = 0;

        for(int i = 1; i <= broj/2; i++){
            if ((broj % i) == 0){
                sumaDjelitelja += i;
            }
        }

        if(sumaDjelitelja == broj){
            return true;
        } else{
            return false;
        }
    }

}
