import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            String a = r.readLine();
            String b = r.readLine();
            canSpellBob(a, b);
        }
    }

    private static void canSpellBob(String a, String b) {
        char a1 = a.charAt(0), a2 = a.charAt(1), a3 = a.charAt(2);
        char b1 = b.charAt(0), b2 = b.charAt(1), b3 = b.charAt(2);
        if ((a1 == 'b' || b1 == 'b') && (a2 == 'o' || b2 == 'o') && (a3 == 'b' || b3 == 'b')
                || (a1 == 'o' || b1 == 'o') && (a2 == 'b' || b2 == 'b') && (a3 == 'b' || b3 == 'b')
                || (a1 == 'b' || b1 == 'b') && (a2 == 'b' || b2 == 'b') && (a3 == 'o' || b3 == 'o')) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}