public interface OurQueue {
    int size();
    void enqueue(String person);

    String dequeue();

}
