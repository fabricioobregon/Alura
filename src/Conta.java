/**
 * Created by fabricioobregon on 2017-06-12.
 */
public class Conta {

        int saldo;
        int limite;
        String titular;
        int conta;


        void CadastraConta(int saldo, int limite, int agencia, String titular) {
                this.conta = agencia;
                this.limite = limite;
                this.saldo = saldo;
                this.titular = titular;
        }

        private boolean VerificaSaldo(int valor) {
                if (this.saldo < valor) {
                        System.out.println("Seu saldo é insuficiente para esta operação!");
                        System.out.println("Seu saldo atual é de " + this.saldo + "reais.");
                        return false;
                } else {
                        return true;
                }

        }

        void VerSaldo() {
                System.out.println("Seu saldo disponível  é de: " + this.saldo + " reais.");
        }

        void Saca(int valor) {
                if (this.VerificaSaldo(valor)) {
                        this.saldo -= valor;
                        this.VerSaldo();
                }
        }

        void Transfere (Conta destino, int valor){
                if(this.VerificaSaldo(valor)) {
                        this.saldo -= valor;
                        destino.saldo += valor;
                        this.VerSaldo();
                }
        }
}