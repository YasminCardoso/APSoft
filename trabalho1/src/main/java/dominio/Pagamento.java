package dominio;

import java.util.Date;

public class Pagamento {
	public Venda venda;
	public Date data;
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
