public class Exemplu3 {
    /*
        while
        do while
        for

     */

    public static void main(String [] args) {
        int n = 10;

        int factorial = 1;
        while(n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println("factorial = " + factorial);

        n = 10;
        factorial = 1;
        do {
            factorial *= n;
            n--;
        } while (n > 0);
        System.out.println("factorial = " + factorial);

        n = 10;
        factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);

//        for(;;){ bucla infinit
//
//        }
    }
}
