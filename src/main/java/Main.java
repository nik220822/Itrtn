public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(1_000_000_100, 1_000_001_000)) {
            System.out.println("Случайное число: " + r);
            if (r == 1_000_000_777) {
                System.out.println("Выпало число " + r + ", давайте на этом закончим");
                break;
            }
        }
    }
}
