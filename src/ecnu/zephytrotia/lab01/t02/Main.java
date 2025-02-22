/**
 * @Author: Zephyrtoria
 * @CreateTime: 2025-02-22
 * @Description:
 * @Version: 1.0
 */

package ecnu.zephytrotia.lab01.t02;

import java.util.*;

public class Main {
    private static final int N = 100010;
    private static int[] arr = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, 0, n);
        int cur = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (cur >= arr[i]) {
                continue;
            }
            cur = arr[i] + k;
            count++;
        }
        System.out.println(count);
    }
}
