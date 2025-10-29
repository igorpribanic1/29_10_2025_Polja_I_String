public class KlasaString {
    public static void main(String[] args) {
       /* String proba = "Danas je srijeda, na predavanju sam!";
        System.out.println(proba);
        System.out.println("Duljina stringa je: " + proba.length() + " znakova");
        System.out.println("Znak na indexu 0 je: " + proba.charAt(0));
        System.out.println("Index gdje se nalazi znak n (prvo pojavljivanje): " + proba.indexOf('n'));
        System.out.println("Index gdje se nalazi znak n (drugo pojavljivanje): " + proba.indexOf('n',3));
        System.out.println("Ends with: " + proba.endsWith("am!"));
        System.out.println("Contains: " + proba.contains("am!"));*/

        String rijec = "Perica";
        String rijec1 = new String("Perica");

        System.out.println("Jednakost stringova");
        // Usporedba vrijednosti stingova - metodu equals je bolje koristiti kod usporedbe String varijabli (a kasnije i nizove)
        System.out.println(rijec.equals(rijec1));
        // Usporedba string objekata - promatra nalaze li se te dvije varijable na istoj memorijskoj lokaciji
        System.out.println(rijec == rijec1);


    }
}
