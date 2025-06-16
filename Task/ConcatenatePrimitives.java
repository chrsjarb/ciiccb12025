package Task;

public class ConcatenatePrimitives {
    public static void main(String[] args) {

        byte zero = 0;
        char ch = 'H';
        int number = 3110;
        boolean bool = true;
        float decimal = 2.0f;

        String output = ch + Integer.toString(number) + " w" + zero + "rld " + decimal + " " + bool;

        System.out.println();
        System.out.println(output);
        System.out.println();
    }
}

