import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class abc {
    public static void main (String [] args) throws Exception {
        char [] chars = new char [] {'\u0097'};
        String str = new String (chars);
        byte[] bytes = str.getBytes ();
        System.out.println (Arrays.toString (bytes));
    }


        }
