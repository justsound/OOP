import java.util.LinkedList;
import java.util.Queue;

public class MarketQueue implements OurQueue {

    Queue<String> queue;

    {
        queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }
}