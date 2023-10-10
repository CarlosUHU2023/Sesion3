package pkg;

public class Calculadora {

	public static Object suma(int i, int j) {
		return i+j;
	}

	public static Object resta(int i, int j) {
		return i-j;
	}

	public static Object multiplica(int i, int j) {
		return i*j;
	}

	public static Object divide(int i, int j) {
		if(j!=0)
			return i/j;
		else
			return -1;
	}

}
