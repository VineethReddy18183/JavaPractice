import java.util.*;
class Arrays{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = arr[i]*2;
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}