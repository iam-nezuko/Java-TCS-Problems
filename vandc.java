//vowels and consonants in a string;
import java.util.*;
public class vandc {
    public static void main(String a[]){
        int v=0,c=0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    v++;
                else
                    c++;
            }
        }
        System.out.println(str.length());
        System.out.println("Number of Vowels: "+ v);
        System.out.println("Number of Consonants: "+ c);
    }
}
