import java.io.IOException;
import java.io.InputStream;

public class NumberSpiral {
    static class FastScanner {
        private final InputStream in = System.in;
        private byte[] buffer = new byte[1 << 16];
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
            } while (c < ' ');

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
            return sign * val;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long x = fs.nextInt();
            long y = fs.nextInt();
            long max = Math.max(x, y);
            long ans;

            if (max % 2 == 0) {
                if (max == x) {
                    ans = x * x - y + 1;
                } else {
                    ans = (y - 1) * (y - 1) + x;
                }
            } else {
                if (max == x) {
                    ans = (x - 1) * (x - 1) + y;
                } else {
                    ans = y * y - x + 1;
                }
            }

            sb.append(ans);
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
