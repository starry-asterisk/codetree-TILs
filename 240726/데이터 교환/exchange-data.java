public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp;
        temp = b;
        b = a;
        a = c;
        c = temp;
        System.out.printf("%d\n", a);
        System.out.printf("%d\n", b);
        System.out.printf("%d\n", c);
    }
}