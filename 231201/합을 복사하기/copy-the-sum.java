public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int add = a+b+c;
        
        a = b = c = add;

        System.out.print(a+" "+b+" "+c);
    }
}