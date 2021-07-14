import java.util.ArrayList;
/**
 * List class extending Base
 * @author Rustenis Tolpeznikas
 */
public class List extends Base
{
    private ArrayList<Integer> list;

    public List()
    {
        list = new ArrayList();
    }

    /**
     * @param input adds to the Array List
     */
    public void add(int input)
    {
        list.add(input);
    }

    public void sort()
    {
        super.baseSort(list);
    }

    /**
     * @return String returns Array as String
     */
    @Override
    public String toString()
    {
        return list.toString();
    }
}
