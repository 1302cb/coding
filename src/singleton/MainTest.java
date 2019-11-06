package singleton;

public class MainTest {
    public static void main(String[] args) {
        for(int i=0;i<15;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(StaticInnerSingleton.getInstance().toString());
                }
            }).start();
        }

    }
}
