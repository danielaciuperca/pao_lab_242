public class Exemplu1 {
    public static void main(String[] args) {
        int[] v = new int[7]; //initializare
        v[0] = 10; //atribui o valoare primului element
        v[1] = 15;
        v[2] = 10;
        //v[8] = 10; -> ArrayIndexOutOfBoundsException

        for(int i = 0;  i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");

        for(var number : v) {
            System.out.print(number + " ");
        }

        String[] words = new String[2];
        words[0] = "abc";
        words[1] = "bcd";

        //String [] a = new String[0]; -> dimensiunea trebuie sa fie > 0

        int[][] m1 = new int[3][5];
        int[][] m2 = new int[3][3];
        m1[0][1] = 10;
    }
}
