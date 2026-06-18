import java.util.Scanner;
import java.util.HashMap;

public class CheckKey {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("Number of Entries:");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int key = s.nextInt();
            String value = s.next();
            map.put(key, value);
        }

        System.out.println("Enter key:");
        int key = s.nextInt();

        if (map.containsKey(key)) {
            System.out.println("Key exists");
        } else {
            System.out.println("Key does not exist");
        }

        s.close();
    }
}
