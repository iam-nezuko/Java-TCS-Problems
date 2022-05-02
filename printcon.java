// print only consonants in small letters in the order they appear in input
import java.util.*;
public class printcon {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                
            }
            else{
                System.out.print(ch);
            }
        }
    }
}
