package main.orderystem;

import java.math.BigDecimal;

interface Pagamento {
    public boolean processarPagamento(Produto produto, BigDecimal valor);
}
