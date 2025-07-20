package entities;

public class PagamentoCartao extends Pagamento{
 
    @Override
    public void realizarPagamento(double valor){
        System.out.printf("Pagamento com Cartão de crédito no valor de %.2f reais realizado com sucesso. %n",valor);
    }
    


}
