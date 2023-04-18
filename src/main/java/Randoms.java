import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    int max;
    int min;
    int newMax;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        this.newMax = max - min;
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
                int n = random.nextInt(newMax);
                return n + min;
            }
        };
    }
}