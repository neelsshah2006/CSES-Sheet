import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class Playlist {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int len = 0, ptr = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0)
                    return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
            int freq = map.getOrDefault(arr[i], 0);
            if (freq == 0) {
                map.put(arr[i], freq + 1);
            } else {
                maxLen = Math.max(i - start, maxLen);
                while (arr[start] != arr[i]) {
                    map.remove(arr[start]);
                    start++;
                }
                start++;
            }
        }
        maxLen = Math.max(maxLen, n - start);
        System.out.println(maxLen);
    }
}