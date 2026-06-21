import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // Read n elements
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        // Element to search
        int k = s.nextInt();

        if (list.contains(k)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        s.close();
    }
}
