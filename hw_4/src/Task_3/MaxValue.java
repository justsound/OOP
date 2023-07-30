package Task_3;

public class MaxValue <T extends Comparable> {
        public T getMax(T a, T b) {
            return a.compareTo(b) >= 0 ? a : b;
        }
}

