public class PrimulExemplu {
    //primitive
    /*
        byte
        short
        int
        long
        float
        double
        boolean
        char
     */

    public static void main(String [] args) {
        byte number1; //declarare
        number1 = 10; //atribuire
        System.out.println(number1);

        byte number2 = 12; //initializare
        System.out.println(number2);

        int number3 = 1000;
        System.out.println(number3);

        long number4 = 2000;
        System.out.println(number4);

        float number5 = 4.5F;
        System.out.println(number5);

        double number6 = 4.5;
        System.out.println(number6);

        boolean b1 = true;
        System.out.println(b1);

        boolean b2 = false;
        System.out.println(b2);

        char char1 = '6';
        System.out.println(char1);

        char char2 = '\u231B';
        System.out.println(char2);

        System.out.println(new String(Character.toChars(0x1F349)));
    }

}
