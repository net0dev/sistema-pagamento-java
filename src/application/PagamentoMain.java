package application;
import java.util.Locale;
import entities.Pagamento;
import entities.PagamentoBoleto;
import entities.PagamentoCartao;
import entities.PagamentoPix;
public class PagamentoMain {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);



 Pagamento[] pagamentos = { 
    new PagamentoBoleto(),
    new PagamentoCartao(),
    new PagamentoPix()
 };


 double[] valores = {993.34, 1300.92, 70000.0};


 for(int i = 0; i< pagamentos.length; i++){
    pagamentos[i].realizarPagamento(valores[i]);

 }


   
}


}
    

