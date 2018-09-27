import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = r.readLine()).startsWith("42"))
            System.out.println(s);
        
    }


}