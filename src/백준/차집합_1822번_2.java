package 백준;
import java.util.*;
public class 차집합_1822번_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        HashSet<Integer> setA = new HashSet<>();
        for (int i = 0; i < a; ++i) {
            setA.add(scan.nextInt());
        }

        for (int i = 0; i < b; ++i) {
            setA.remove(scan.nextInt());  // A에서 B에 있는 요소를 제거
        }

        int[] result = setA.stream().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println(result.length);
        if (result.length != 0) {
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
        scan.close();
    }
}
