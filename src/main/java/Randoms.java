import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    int max;
    int min;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int n = min - 1;
                while (n < min) {
                    n = random.nextInt(max);
                }
                return n;
            }
        };
    }
}