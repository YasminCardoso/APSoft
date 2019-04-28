package apsoft.t1venda;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Venda {
    public Date data;
    public Cliente cliente;
    public Map<Produto, Integer> itens = new HashMap<Produto, Integer>();
    //List<String> itens = new ArrayList<String>();
    private BigDecimal pagamento = null;
    public String codigo;
    
	
    //Método para adicionar um item a itens.
    public void adicionarItem(Produto produto, ItemVenda itemVenda) {
    	if(produto!=null || itemVenda!=null) {
    		itens.put(produto, itemVenda.quantidade);
    	}
    	else {
    		throw new IllegalArgumentException("Produto e quantidade não podem ser nulos!");
    	}
    }
    
    //Método para remover um produto da lista. 
    public void removerItem(Produto produto) {
    	if(itens.containsKey(produto)){
    		itens.remove(produto);
    	}
    	else {
    		throw new IllegalStateException("O produto a ser removido não existe!");
    	}
    }
    
    //Método para atualizar um item da lista.
    public void atualizarItem(Produto produtoAntigo, Produto produtoNovo, ItemVenda itemVendaAntigo, ItemVenda itemVendaNovo) {
    	if(itens.containsKey(produtoAntigo)){
    		if(produtoNovo!=null || itemVendaNovo!=null) {
    			itens.remove(produtoAntigo, itemVendaAntigo.quantidade);
    			itens.put(produtoNovo, itemVendaNovo.quantidade);
    		}
    		else {
    			throw new IllegalArgumentException("Produto e quantidade não podem ser nulos!");
    		}
    	}
    	else {
    		throw new IllegalStateException("O produto a ser atualizado não existe!");
    	}
 
    }
    
    //Do jeito que eu fiz, talvez precise de Spring, pra usar getProdutoByNome().
    public BigDecimal getTotal() {
    	BigDecimal total = null;
    	Iterator<Entry<Produto, Integer>> it = itens.entrySet().iterator();
    	if(itens!=null) {
    		while(it.hasNext()) {
    			Entry<Produto, Integer> entry = it.next();
    			//Aqui em baixo eu fiz sem usar o QuantiaMonetaria, troquei pelo BigDecimal
    			total = total.add((entry.getKey().precoUnitario).multiply(BigDecimal.valueOf(entry.getValue())));
    		}	
    	}
    	else {
    		throw new IllegalStateException("A lista de produtos está vazia!");
    	}
    	return total;
    }
    
    //Método para saber se a venda está quitada ou não.
    public Boolean estaQuitada() {
    	if(pagamento.compareTo(getTotal()) == 1 || pagamento.equals(getTotal())) {
    		return true;
    	}
    	return false;
    }
    
    //Registra a parcela paga.
    public void registrarPagamento(BigDecimal valorParcela) {
    	pagamento = pagamento.add(valorParcela);
    }
    
}
