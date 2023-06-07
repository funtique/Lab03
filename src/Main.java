public class Main {
    public static void main(String[] args) {


        Client sun = new Client();
        sun.addToCart(10,24);
        System.out.println(sun.toString());

        Client moon = new Client();
        moon.addToCart(123,5);
        System.out.println(moon.toString());


    }
}