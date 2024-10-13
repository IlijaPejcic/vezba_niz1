import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] items = {"Heart", "Cherry", "Coin", "Melon", "Joker"};

        Random random = new Random();
        String result = items[random.nextInt(items.length)] + " - " +
                items[random.nextInt(items.length)] + " - " +
                items[random.nextInt(items.length)] + " - " +
                items[random.nextInt(items.length)] + " - " +
                items[random.nextInt(items.length)];

        System.out.println("Nasumična kombinacija: " + result);
    }
}