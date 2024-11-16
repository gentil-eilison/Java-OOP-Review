package main.orderystem;

import java.math.BigDecimal;

public class PagamentoPix implements Pagamento {
    @Override
    public boolean processarPagamento(Produto produto, BigDecimal valor) {
        if ((produto.calcularDesconto().compareTo(valor) == 0)) {
            System.out.println("Pagamento PIX processado com sucesso!");
            return true;
        }
        return false;
    }
}
