//programador de app
public class Teste {
    public static void main(String[] args) {
        //criando os objetos
        ContaBancaria contaDoJoao = new ContaBancaria();
        ContaBancaria contaDaMaria = new ContaBancaria(100);
        ContaBancaria contaDoWonder = new ContaBancaria();
        
        //depositos
        contaDoJoao.depositar(1000); 
        contaDoWonder.depositar(500);
        
        //saques
        contaDoWonder.sacar(10);
        contaDoWonder.sacar(40);
        contaDoJoao.sacar(190);
        
        //transferencia entre contas
        contaDaMaria.transferir(100, contaDoJoao);
        
        //visualizando os saldos
        System.out.println("saldo do joao:" + contaDoJoao.getSaldo());
        System.out.println("saldo da maria:" + contaDaMaria.getSaldo());
        System.out.println("saldo do wonder:" + contaDoWonder.getSaldo());
        
    }
}
