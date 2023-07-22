public interface MarketBehaviour extends OurQueue {
    void addMan(String man);
    String removeMan();
    void update();
}
