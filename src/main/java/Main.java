public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(0, 1000)) {
            System.out.println("Случайное число: " + r);
            if (r == 777) {
                System.out.println("Выпало число 777, давайте на этом закончим");
                break;
            }
        }
    }
}
