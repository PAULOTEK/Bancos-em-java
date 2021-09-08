//projetista de classes
public class ContaBancaria {
    
    private double saldo;
    
    public ContaBancaria(double saldoInicial){
        saldo = saldoInicial;
    }
    
    public ContaBancaria(){
        saldo = 0;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        saldo = saldo - valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    
    //definir o método transferir
    //1. tipo de visibilidade (public)
    //2. tipo de retorno
    //3. nome do método
    //4. lista de parâmetros
    //5. implementar o código do método
    public void transferir(double valor, ContaBancaria contaDestino){
        sacar(valor);
        contaDestino.depositar(valor);
    }
}
