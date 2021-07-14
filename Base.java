import java.util.Collections;
import java.util.List;
/**
 * Base class, parent of Array and List
 * @author Rustenis Tolpeznikas
 */
public abstract class Base
{   
    /**
     * @param input list to be sorted
     */
    protected static void baseSort(List input)
    {
        Collections.sort(input);
    }
}
