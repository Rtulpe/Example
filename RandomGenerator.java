import java.util.Random;

/**
 *  Class for generating random numbers.
 *  I have chosen to implement number 
 *  generator as a class, due Exception implementation
 *  @author Rustenis Tolpeznikas
 */
class RandomGenerator
{
    Random randomNumber = new Random();
    final int bound = 512;

    /**
    @param min minimum random value
    @param max maximum random value
    @return temp random value between min and max,
    but not higher than bound limit
     */
    int returnNumberBound(int min, int max)
    {
        int temp = 0;
        boolean isFinished = false;

        while(!isFinished)
        {
            try
            {
                isFinished = true;
                temp = returnNumber(min, max);
                if(temp >= bound) throw new InvalidRandomException("Wrong Random");
            }
            catch(InvalidRandomException e)
            {
                isFinished = false;
            }
        }

        return temp;
    }

    /**
    @param min minimum random value
    @param max maximum random value
    @return temp random value between min and max
     */
    int returnNumber(int min, int max)
    {
        return randomNumber.nextInt(max - min) + min;
    }

    /**
     * Custom Exception
     */
    private class InvalidRandomException extends Exception
    {
        InvalidRandomException(String s)
        {
            super(s);
        }
    }
}