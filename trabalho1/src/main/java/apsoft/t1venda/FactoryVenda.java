package apsoft.t1venda;

import java.util.Map;

//Classe Factory da questão 2
public class FactoryVenda {

	public Venda getVenda(String codigo, Cliente cliente, Map<Produto,Integer> itens) {
		Venda venda = new Venda();
		venda.codigo = codigo;
		venda.cliente = cliente;
		venda.itens = itens;
		return new Venda();
	}
}
