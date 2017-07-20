package foo.bar.baz;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by algis on 17.20.7.
 */
public class Main {

    public static void main(String args[]){
        System.out.println("started");
        while (true){
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt",true));
                Thread.sleep(5000);
                String content = "This is the content to write into file " + LocalDateTime.now().toString();
                bw.write(content);
                System.out.println(content);
            } catch (IOException e) {
                System.out.println("error");
                e.printStackTrace();
            }
            catch ( InterruptedException e1){
                System.out.println("error");
            }
        }
    }
}

