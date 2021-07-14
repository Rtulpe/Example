import java.util.Arrays;
import java.util.List;

/**
 * Array class extending Base
 * @author Rustenis Tolpeznikas
 */
public class Array extends Base
{
    final int arraySize = 20;
    int index = 0;
    private Integer[] array;

    public Array()
    {
        array = new Integer[arraySize];
    }

    /**
     * @param input a value into the Array
     */
    public void add(int input)
    {
        if(index < arraySize)
        {
            array[index] = input;
            index++;
        }
    }

    public void sort()
    {
        super.baseSort(toList());
    }

    /**
     * @return List returns Array as a list
     */
    public List toList()
    {
        return Arrays.asList(array);
    }

    /**
     * @return String used for nicer printing
     */
    @Override
    public String toString()
    {
        return toList().toString();
    }
}
