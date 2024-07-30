package 자바_예외처리의이해;

public class OverdraftException extends Exception{
	public OverdraftException(String msg){
		super(msg);
	}
}
