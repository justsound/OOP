public class Market implements MarketBehaviour{

    MarketQueue queue = new MarketQueue();
    @Override
    public void addMan(String man) {
        enqueue(man);
    }

    @Override
    public String removeMan() {
        return dequeue();
    }

    @Override
    public void update() {

    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(String person) {
        queue.enqueue(person);
    }

    @Override
    public String dequeue() {
        return queue.dequeue();
    }
}