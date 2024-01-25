import java.util.Arrays;
class ReferenceTrap
{
    public static void main(String args[])
    {
        String lastYear []= {"Vineeth","Virat","Dhoni"};
        String thisYear[] = Arrays.copyOf(lastYear,lastYear.length);
        thisYear[1] = "Kohli";
        System.out.println(Arrays.toString(thisYear));
    }
}
