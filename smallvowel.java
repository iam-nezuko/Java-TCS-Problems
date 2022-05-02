import java.util.*;
public class smallvowel {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char large = 'u';
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                if(ch < large){
                    large = ch;
                }
            }
        }
        System.out.println(large);
}
}
