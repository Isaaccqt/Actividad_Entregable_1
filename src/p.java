public class p {

    public static void main(String[] args) {

        int[] n = {5, 7, 3, 7, 2, 9, 7};
        int a = 0;
        int b = 0;
        int c = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > c) {
                c = n[i];
            }
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] == c) {
                a++;
            }
        }

        if (a > 1) {
            b = 1;
        }

        if (b == 1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        int s = 0;
        for (int i = 0; i < n.length; i++) {
            s += n[i];
        }

        double r = (double) s / n.length;
        System.out.println(r);

        if (r >= 5) {
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }
    }
}

