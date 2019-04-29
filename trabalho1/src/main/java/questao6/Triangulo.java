package questao6;

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
		if(n1>0 && n2>0 && n3>0) {
			throw new IllegalArgumentException("Os lado do triangulo devem ser maiores que zero.");
		}
		else if(n1+n2<=n3 || n2+n3<=n1 || n3+n1<=n2){
			throw new IllegalArgumentException("A soma de dois lados do triangulo deve ser maior do que o lado restante.");
		}	
	}
	
	public void setN1(int n1) {
		if(!(n1>0)) {
			throw new IllegalArgumentException("O lado do triangulo deve ser maior que zero.");
		}
		else if (n1+n2<=n3 || n2+n3<=n1 || n3+n1<=n2){
			throw new IllegalArgumentException("A soma de dois lados do triangulo deve ser maior do que o lado restante.");
		}
		else {
			this.n1 = n1;
		}
	}
	
	public void setN2(int n2) {
		if(!(n2>0)) {
			throw new IllegalArgumentException("O lado do triangulo deve ser maior que zero.");
		}
		else if(n1+n2<=n3 || n2+n3<=n1 || n3+n1<=n2){
			throw new IllegalArgumentException("A soma de dois lados do triangulo deve ser maior do que o lado restante.");
		}
		else {
			this.n2 = n2;
		}
	}
	
	public void setN3(int n3) {
		if(!(n3>0)) {
			throw new IllegalArgumentException("O lado do triangulo deve ser maior que zero.");
		}
		else if(n1+n2<=n3 || n2+n3<=n1 || n3+n1<=n2){
			throw new IllegalArgumentException("A soma de dois lados do triangulo deve ser maior do que o lado restante.");
		}
		else {
			this.n3 = n3;
		}
	}
	
}
