package apsoft.trabalho1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    public Date data;
    List<String> itens = new ArrayList<String>();
    BigDecimal pagamento;
    
    //Método para adicionar um item a lista de itens.
    public void adicionarItem(Produto produto, ItemVenda itemVenda) {
    	itens.add(produto.toString() + "/" + itemVenda.toString());
    }
    
    //Método para remover um produto da lista. 
    public void removerItem(Produto produto) {
    	for(int i = 0; i < itens.size(); i++) {
    		if((itens.get(i)).contains(produto.toString())){
    			itens.remove(i);
    		}
    	}	
    }
    
    //Método para atualizar um item da lista.
    public void atualizarItem(Produto produtoAntigo, Produto produtoNovo, ItemVenda itemVendaNovo) {
    	for(int i = 0; i < itens.size(); i++) {
    		if((itens.get(i)).contains(produtoAntigo.toString())){
    			itens.set(i, produtoNovo.toString()+"/"+itemVendaNovo.toString());
    		}
    	}
    }
    
    //Do jeito que eu fiz, talvez precise de Spring, pra usar getProdutoByNome().
    public BigDecimal getTotal() {
    	BigDecimal total = null;
    	return total;
    }
    
    //Método para saber se a venda está quitada ou não.
    public Boolean estaQuitada() {
    	if(pagamento.equals(getTotal())) {
    		return true;
    	}
    	return false;
    }
    
    //Registra a parcela paga.
    public void registrarPagamento(BigDecimal valorParcela) {
    	pagamento = pagamento.add(valorParcela);
    }
}
