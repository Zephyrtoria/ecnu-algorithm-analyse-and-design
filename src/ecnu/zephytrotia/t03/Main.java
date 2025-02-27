/**
 * @Author: Zephyrtoria
 * @CreateTime: 2025-02-27
 * @Description:
 * @Version: 1.0
 */

package ecnu.zephytrotia.t03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int N = 100010;
    static String[] arr = new String[N];

    public static void main(String[] args) throws Exception {
        int n = Reader.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = Reader.next();
        }

        Arrays.sort(arr, 0, n, (a, b) -> {
            StringBuilder sb1 = new StringBuilder(a);
            StringBuilder sb2 = new StringBuilder(b);
            sb1.append(b);
            sb2.append(a);
            return sb2.toString().compareTo(sb1.toString());
        });

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}

class Reader {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    static String nextLine() throws IOException {
        return reader.readLine();
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}