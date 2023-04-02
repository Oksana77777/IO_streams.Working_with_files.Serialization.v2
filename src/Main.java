import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] products = {"Хлеб", "Яблоки", "Молоко"};
    static int[] prices = {100, 200, 300};

    public static void main(String[] args) {

        Basket basket = new Basket(products, prices);

        while (true) {
            showPrice();
            System.out.println("Выберите товар и количество через пробел или введите 'end' ");
            String input = scanner.nextLine();// "номер кол-во"
            if ("end".equals(input)) {
                break;
            }

            String[] parts = input.split(" ");// "номер количество" -> ["номер", "количество"]
            int productNum = Integer.parseInt(parts[0]) - 1;
            int productCont = Integer.parseInt(parts[1]);
            basket.addToCart[productNum] += productCont;
        }

        basket.printCart();
    }

    public static void showPrice() {
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + prices[i] + " руб/шт ");

        }
    }
}