public class Exemplu2 {
    /*
        structuri decizionale
        if
        switch
     */
    public static void main(String[] args) {
        int x = 10;

        if(x % 2 != 0) {
            System.out.println("x este impar");
        } else if(x > 0){
            System.out.println("x este par si pozitiv");
        } else {
            System.out.println("x este par si negativ");
        }

        String zi = "marti";
        switch(zi) {
            case "luni" :
                System.out.println("azi este luni");
                break;
            case "marti" :
                System.out.println("azi este marti");

            case "miercuri" :
                System.out.println("azi este miercuri");
                break;
            default : System.out.println("azi este alta zi");
        }

        int a = 10;
        int b = a > 0 && a % 2 == 0 ? a : 0; // ||
        System.out.println("b = " + b);
    }
}
