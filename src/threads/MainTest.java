package threads;

public class MainTest {
    public static void main(String[] args) {
        Resource resource = new Resource();
        new Thread(new Consumer(resource)).start();
        new Thread(new Consumer(resource)).start();
        new Thread(new Producer(resource)).start();
        new Thread(new Producer(resource)).start();
    }
}
