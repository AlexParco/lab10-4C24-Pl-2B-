package maven.lab10_junit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		App app = new App();	
		int sum = app.sumar(4,5);		
		int res = app.restar(4,5);
	}

	public  int restar(int i, int j) {
		return i-j;
	}

	public  int sumar(int i, int j) {
		return i+j;
	}

	public int division(int i, int j) {
		return i / j;
	}

	public int multiplicacion(int i, int j) {
		return i * j;
	}

}
