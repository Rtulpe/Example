/**
 * Programming task for NXP
 *
 * @author Rustenis Tolpeznikas
 */
public class Application
{
    static final int min = 0;
    static final int max = 1023;
    static final int size = 20;

    public static void main(String args[])
    {
        Array arr1 = new Array();
        List list1 = new List();

        Array arr2 = new Array();
        List list2 = new List();

        RandomGenerator rnd = new RandomGenerator();

        for(int i = 0; i < size; i++)//Filling without 512 exception limit
        {   
            arr1.add(rnd.returnNumber(min, max));
            list1.add(rnd.returnNumber(min, max));
        }

        System.out.println("No-exception, not sorted");
        System.out.println(arr1);
        System.out.println(list1);

        arr1.sort();
        list1.sort();

        System.out.println("No-exception, sorted");
        System.out.println(arr1);
        System.out.println(list1);

        for(int i = 0; i < size; i++)//Filling with 512 limit
        {
            arr2.add(rnd.returnNumberBound(min, max));
            list2.add(rnd.returnNumberBound(min, max));
        }

        System.out.println("With exception, not sorted");
        System.out.println(arr2);
        System.out.println(list2);
    }
}
