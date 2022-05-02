import java.util.*;
public class rnum {
    
    public static void main(String a[]){
        int num,temp;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num != 0){
            temp = num%10;
            System.out.print(temp);
            num = num/10;
        }
    }
}
