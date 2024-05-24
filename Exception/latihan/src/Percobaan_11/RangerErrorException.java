package Percobaan_11;

public class RangerErrorException extends Throwable {
    public RangerErrorException(String s)
    {
        super(s);
    }

    public static void main(String[] args) {
        int position=-1;
        try {
            if (position > 0) 
            {
                throw new RangerErrorException("Position" + position);
            }
        } catch (RangerErrorException e) 
        {
            System.out.println("Range error: " + e.getMessage());
        }
        System.out.println("This is the last program");
    }
}
