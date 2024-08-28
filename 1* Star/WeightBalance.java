import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t > 0) {
            t--;
            String[] input = reader.readLine().split(" ");
            int w1 = Integer.parseInt(input[0]);
            int w2 = Integer.parseInt(input[1]);
            int x1 = Integer.parseInt(input[2]);
            int x2 = Integer.parseInt(input[3]);
            int M = Integer.parseInt(input[4]);

            int A = w2 - w1;
            if (A >= x1 * M && A <= x2 * M) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
