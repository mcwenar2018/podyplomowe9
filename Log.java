public class Log {
    public static void main(String[] args) {
        //negacje !
        //koniunkcja && -> kompilator od lewej do prawej
        //alternatywa || -> kompilator od lewej do prawej dziala przy sprawdzeniu warunku


        int x = 0;
        int y = 5;


        boolean test = ((x > 0) && (y++ > 3));
        System.out.println(test);
        System.out.println(y);

        //kolejnosc wykonywania dzialan
        int w = 6 + 4 / 2;
        System.out.println("w= " + w);

        //uwaga

        System.out.println(1 + 2 + "z");
        System.out.println("z"+ 1 + 2);

    }
}
