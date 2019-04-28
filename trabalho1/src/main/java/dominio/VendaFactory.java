package dominio;

import java.util.Map;

//Classe Factory da questão 2
public class VendaFactory {

	public Venda getVenda(Cliente cliente, Map<Produto,Integer> itens) {
		Venda venda = new Venda();
		venda.cliente = cliente;
		venda.itens = itens;
		return venda;
	}
}
