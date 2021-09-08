package contabanco2;
public class Conta {
     private int numero;
       

        public Conta(){
            saldo = 0;
        }

        public Conta(int numero){
            this.numero = numero;
            
        }

        public Conta(double saldoInicial){
            saldo = saldoInicial;
        }

        public void depositar(double valor){
            double novoSaldo = saldo + valor;
            saldo = novoSaldo;
        }

        public void sacar(double valor){
            double novoSaldo = saldo - valor;
            saldo = novoSaldo;
        }

        public double getSaldo( ){
            return saldo;
        }

        public int getNumero() {
            return numero;
        }

}

