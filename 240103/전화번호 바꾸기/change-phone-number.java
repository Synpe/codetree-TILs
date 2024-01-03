import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");
        
        String aStr = sc.next(); 
        String xStr = sc.next(); 
        String yStr = sc.next();

        System.out.print(aStr+"-"+yStr+"-"+xStr);
    }
}

// int so 0 no
// 그러면 괄호치고 0을 하나 더 넣자! <---- 조건에 안맞아서 탈락
// a는 공백 bc +앞에 사용해야됨.
// 만약에 0을 추가시키고 포맷한다음 다시하면 :thinking: