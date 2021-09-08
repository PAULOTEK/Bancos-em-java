
public class Funcionario {
 
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void aumentarSalario(double percentual){
        this.salario = this.salario * (1 + (percentual/100));
        
        //double aumento = salario * (percentual / 100);
        //salario = salario + aumento;
    }
    
    public String getNome(){
       return this.nome; 
    }
    
    public double getSalario(){
        return this.salario;
    }
    
}
