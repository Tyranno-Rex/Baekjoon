import java.util.*;

public class B2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();
        for (int i = 0 ; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if ((sum - (arr[i] + arr[j])) == 100) {
                    arr[i] = -1;
                    arr[j] = -1;

                    Arrays.sort(arr);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}