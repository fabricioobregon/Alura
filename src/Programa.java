/**
 * Created by fabricioobregon on 2017-06-12.
 */
public class Programa {
    public static void main(String[] args) {
        Conta cliente1;
        Conta cliente2;
        cliente1 = new Conta();
        cliente2 = new Conta();



        cliente1.CadastraConta(500,1000,850,"Fabricio");
        cliente2.CadastraConta(500,1000,850,"Asami");
        cliente1.Saca(600);
        cliente2.Transfere(cliente1, 300);
        cliente1.VerSaldo();
    }
}
