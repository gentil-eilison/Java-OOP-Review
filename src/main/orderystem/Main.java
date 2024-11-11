package main.orderystem;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Eletronico kindle = new Eletronico(1, "Kindle 11th Generation", new BigDecimal("539.99"));
        String output = "Preço do %s: R$ %s";
        System.out.println(String.format(output, kindle.getNome(), kindle.getPreco()));
        output = "Preço do %s com Desconto: R$ %s";
        System.out.println(String.format(output, kindle.getNome(), kindle.calcularDesconto()));
        PagamentoPix pix = new PagamentoPix();
        boolean sucesso = pix.processarPagamento(kindle, new BigDecimal("538.99"));
        if (!sucesso) {
            System.out.println("Valor insuficiente!");
        }

        Vestuario camisetaInsider = new Vestuario(2, "Tech T-Shirt", new BigDecimal("152"));
        output = "Preço da %s: R$ %s";
        System.out.println(String.format(output, camisetaInsider.getNome(), camisetaInsider.getPreco()));
        output = "Preço da %s com Desconto: R$ %s";
        System.out.println(String.format(output, camisetaInsider.getNome(), camisetaInsider.calcularDesconto()));
        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        sucesso = pagamentoCartao.processarPagamento(camisetaInsider, new BigDecimal("152"));
        if (!sucesso) {
            System.out.println("Valor insuficiente!");
        }
    }
}
