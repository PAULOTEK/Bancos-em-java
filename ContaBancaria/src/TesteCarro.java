//estou imaginando alto

public class TesteCarro {
    
    public static void main(String args[]){
    
        Carro fusca = new Carro(10);
        Carro gol = new Carro(13);
 
        
        gol.addGasolina(10);
        gol.addGasolina(20);
        fusca.addGasolina( 30 );
        
        fusca.dirigir(100);
        gol.dirigir(10);
        gol.dirigir(10);
        gol.dirigir(5);
    
        double gasolina = fusca.getGasolinaNoTanque();
        System.out.println("Nivel de gasolina (Fusca):" + gasolina);
        
        System.out.println("Nivel de gasolina (Gol):" + gol.getGasolinaNoTanque());
        
    }
    
    
}
