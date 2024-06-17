import java.util.*;

public class Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s];
        int a1[] = new int[s];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
            if (a[i] != 10) {
                list.add(a[i]);
            }
        }

        a1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a1[i] = list.get(i);
        }

        for (int i = 0; i < s; i++) {
            System.out.println(a1[i]);
        }

        sc.close();
    }
}

