
public class Estudante {
    
    private String nome;
    private double somaDasNotas;
    private int quantidadeNotas;
    
    public Estudante(String nome){
        this.nome = nome;
        this.quantidadeNotas = 0;
    }
    
    public void addNota(double nota){
        this.somaDasNotas += nota;
        this.quantidadeNotas += 1;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getNotaMedia(){
        return (this.somaDasNotas / this.quantidadeNotas);
    }
    
}
