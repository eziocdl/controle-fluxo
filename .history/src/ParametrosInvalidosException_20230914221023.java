
public class ParametrosInvalidosException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException() {
		super("O segundo número precisa ser maior que o primeiro");
		
	}
}