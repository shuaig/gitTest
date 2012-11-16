import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: shuaig
 * Date: 14/11/12
 * Time: 22:48
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
     public static void main(String[] argv) throws IOException {
        BufferedReader buff = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.print("Hi  What's your name? ");
        System.out.flush();
        String s = buff.readLine();
        System.out.printf("Hello, %s!", s);
    }
}
