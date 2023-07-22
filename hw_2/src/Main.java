public class Main {
    public static void main(String[] args) {
        MarketBehaviour market = new Market();
        market.addMan("Alex");
        market.addMan("Olya");
        System.out.println("Размер очереди: " + market.size());
        System.out.println("Следующий человек: " + market.removeMan());

    }
}