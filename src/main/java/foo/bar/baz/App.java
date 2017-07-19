package foo.bar.baz;

/**
 * Created by algis on 17.19.7.
 */
public class App {

    public App(){
    }

    public void start(){
        System.out.println("Started ....");

        Thread thread = new Thread(new AppThread());
        thread.start();

        System.out.println(".... and finished");
    }

    public void stop(){
        System.out.println("this is stop thing");
    }
}
