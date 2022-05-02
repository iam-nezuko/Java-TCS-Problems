import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Medicine[] medicine = new Medicine[4];
        String search;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i< medicine.length; i++){
            String medicineName = sc.nextLine();
            String batchNo = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            medicine[i] = new Medicine(medicineName, batchNo, disease, price);
        }

        search = sc.nextLine();
        Integer[] price = medicinePriceForGivenDisease(medicine, search);
        sc.close();
        for(int i=0;i<price.length;i++) {
            System.out.println(price[i]);
            }
        }
        public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease)
            {
                //method logic
                //code to find price, sort and return the sorted array.
                    Integer[] result = new Integer[0];
                    for(int i=0; i< medicine.length; i++){
                        if(medicine[i].getDisease().equalsIgnoreCase(disease))
                        {
                            result = Arrays.copyOf(result, result.length+1);
                            result[result.length-1] = medicine[i].getPrice();
                        }
                        Arrays.sort(result);
                    }
                    return result;
            }
    }

    class Medicine
    {
    //code to build Medicine class
    String medicineName;
    String batchNo;
    String disease;
    int price;

    public int getPrice(){
        return price;
    }

    public String getDisease(){
        return disease;
    }

    Medicine(String medicineName, String batchNo, String disease, int price){
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.disease = disease;
        this.price = price;
    }
    
}