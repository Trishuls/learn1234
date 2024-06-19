package learn;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String str)
    {
        super(str);
    }
}
public class CustomException {
    static void validate(int val) throws InvalidAgeException {
        if (val < 18)
        {
            throw new InvalidAgeException("not eligible to vote");
        }
        else
        {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try{
            validate(13);
        } catch (InvalidAgeException e) {
            throw new InvalidAgeException("Exception caught");
        }
    }
}
