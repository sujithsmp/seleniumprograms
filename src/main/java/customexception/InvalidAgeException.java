package customexception;

public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String eg)
	{
		super(eg);
	}
}
