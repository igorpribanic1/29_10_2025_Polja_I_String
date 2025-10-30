import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        String upisanaGodina = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ovaj program provjerava je li upisana godina prijestupna ili ne.");
        System.out.print("Upišite godinu koju želite provjeriti: ");

        upisanaGodina = sc.nextLine();

        while(!isStringNumeric(upisanaGodina)){
            System.out.print("\nGreška u radu. Uneseni podatak nije pozitivni cijeli broj!\nUpišite godinu koju želite provjeriti: ");
            upisanaGodina = sc.nextLine();
        }

        int intUpisanaGodina = Integer.parseInt(upisanaGodina);

        if(((intUpisanaGodina % 4 == 0) && (intUpisanaGodina % 100 > 0)) || (intUpisanaGodina % 400 == 0)){
            System.out.print("Upisana godina " +upisanaGodina+ ". je prijestupna!");
        } else{
            System.out.print("Upisana godina " +upisanaGodina+ ". nije prijestupna!");
        }

    }



    private static boolean isStringNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
