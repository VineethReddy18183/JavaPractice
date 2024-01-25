import java.util.*;

public class JavaTax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<5;i++)
        {
            arr[i]  = arr[i] + arr[i]*0.3;
        }
        String tax_array = "";
        for(int i = 0;i<5;i++){
            tax_array = tax_array + arr[i] + " ";

        }
        System.out.println(tax_array);
    }
}

