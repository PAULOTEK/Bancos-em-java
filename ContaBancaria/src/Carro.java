
public class Carro {
    
    //variaveis de instancia
    private double consumo;
    private double tanque;
    
    public Carro(double consumo){
        this.consumo = consumo;
    }
    
    public void addGasolina(double quantidade){
        this.tanque = this.tanque + quantidade;
        //tanque += quantidade;
    } 
    
    public void dirigir(double km){
        double kmPorLitro = km / this.consumo;
        this.tanque = this.tanque - kmPorLitro;
    }
    
    public double getGasolinaNoTanque(){
        return this.tanque;
    }
    
}
