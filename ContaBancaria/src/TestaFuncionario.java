
public class TestaFuncionario {
    public static void main(String[] args) {
        
        //chamada do contrutor
        Funcionario wonder = new Funcionario("Wonder Alves", 1000);
        
        wonder.aumentarSalario(50);
        
        System.out.println("Nome:" + wonder.getNome() );
        
        System.out.println("Salario:" + wonder.getSalario() );
    }
}
 