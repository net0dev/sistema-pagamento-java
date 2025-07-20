package entities;

public class PagamentoPix extends Pagamento{

    @Override
    public void realizarPagamento(double valor){
        System.out.printf("Pagamento via PIX no valor de %.2f reais realizado com sucesso. %n",valor);
    }
    
}
