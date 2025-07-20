package entities;

public class PagamentoBoleto extends Pagamento {
    
    @Override
    public void realizarPagamento(double valor){
        System.out.printf("Pagamento via boleto no valor de %.2f reais realizado com sucesso.%n", valor);
    }
}
