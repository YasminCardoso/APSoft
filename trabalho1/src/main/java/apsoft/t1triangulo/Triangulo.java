package apsoft.t1triangulo;

public class Triangulo {
	private int n1;
	private int n2;
	private int n3;
	
	public Triangulo(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public Triangulo() {
		if(n1>0 && n2>0 && n3>0 && n1+n2>n3 && n2+n3>n1 && n3+n1>n2) {
		}
		else {
			throw new IllegalArgumentException("A invariante de classe está sendo violada!");
		}	
	}
	
	public void setN1(int n1) {
		if(n1>0) {
			this.n1 = n1;
		}
		else {
			throw new IllegalArgumentException("A invariante de classe está sendo violada!");
		}	
	}
	
	public void setN2(int n2) {
		if(n2>0) {
			this.n2 = n2;
		}
		else {
			throw new IllegalArgumentException("A invariante de classe está sendo violada!");
		}
	}
	
	public void setN3(int n3) {
		if(n3>0) {
			this.n3 = n3;
		}
		else {
			throw new IllegalArgumentException("A invariante de classe está sendo violada!");
		}
	}
	
}
