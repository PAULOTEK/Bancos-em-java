
public class TestaEstudante {
    
    public static void main(String[] args) {
        
        //chamada do construtor
        Estudante joao = new Estudante("João Pedro");
        
        joao.addNota(9);
        joao.addNota(7);
        joao.addNota(7);
        joao.addNota(8);
        joao.addNota(6);
        joao.addNota(10);
        
        System.out.println("Aluno: " + joao.getNome() );
        System.out.println("Nota: " + joao.getNotaMedia() );
        
    }
    
}
