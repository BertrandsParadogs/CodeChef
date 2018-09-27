import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int numCase = Integer.parseInt(r.readLine());
        for (int i = 0; i < numCase; i++) {
            String[] s = r.readLine().split(" ");
            System.out.println((Integer.parseInt(s[0])-1) * (Integer.parseInt(s[1])-1));
        }
    }


}