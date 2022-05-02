import java.util.*;
public class oddpos{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        for(int i=0; i< str.length();i=i+2){
            System.out.print(str.charAt(i));
        }
    }
}