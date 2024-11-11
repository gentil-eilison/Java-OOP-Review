package main.orderystem;

import java.math.BigDecimal;

public class PagamentoCartao implements Pagamento {
    @Override
    public boolean processarPagamento(Produto produto, BigDecimal valor) {
        if ((produto.getPreco().compareTo(valor) == 0)) {
            System.out.println("Pagamento em Cartão processado com sucesso!");
            return true;
        }
        return false;
    }
}
