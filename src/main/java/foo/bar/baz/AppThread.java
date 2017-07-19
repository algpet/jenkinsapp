package foo.bar.baz;

/**
 * Created by algis on 17.19.7.
 */
public class AppThread implements Runnable {
    public void run(){
        try {
            Thread.sleep(3000);
            System.out.println("Exception");
            throw new IllegalStateException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
