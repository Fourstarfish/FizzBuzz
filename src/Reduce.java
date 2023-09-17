public class Reduce {

    public static void main(String[] args) {
        int rslt = 0;
        int i = 100;
        while (i != 0) {
            if (i % 2 == 0) {
                i = i / 2;
                rslt++;
            }
            else {
                i = i - 1;
                rslt++;
            }
        }
        System.out.println(rslt);
    }
}
