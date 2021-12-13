public class A_3_exception {
    public static void main(String[] args) {
		int age=-19;
		try {
			ticketing(age);
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
	}
	public static void ticketing(int age)throws AgeException{
		if (age<0) {
			throw new AgeException("You entered the wrong age.");
		}
	}
}
class AgeException extends Exception{
	public AgeException() {
		
	}
	public AgeException(String message) {
		super(message);
	}
}