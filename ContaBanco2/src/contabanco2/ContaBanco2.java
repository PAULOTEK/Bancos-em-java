package contabanco2;
public class ContaBanco2 {
    public static void main(String[] args) {
        Conta conta1 = new Conta (25000,8398);
        Conta conta2 = new Conta (25000,9999);
        Conta conta3 = new Conta (25000,5555);
        Conta conta4 = new Conta (25000,1111);
        Conta conta5 = new Conta (25000,2222);
        
        
        //consultar a conta: 3333
        ContaBanco2 c = bb.consultar(3333, 123);
        System.out.println("Numero: " + c.getNumero());
        System.out.println("Senha: " + c.getSenha());
        System.out.println("Saldo:" + c.getSaldo());
    }
    
}
