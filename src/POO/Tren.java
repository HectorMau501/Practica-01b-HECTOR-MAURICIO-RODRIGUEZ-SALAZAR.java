
package POO;

//Clase padre
public class Tren extends Transporte
{
    //Atributos
    private double peso;
    private float velocidad;
    private String modelo;

    //Metodo contructor vacio
    public Tren(){}
    
    
    Transporte trans1 = new Transporte();

    public Tren(double peso, float velocidad, String modelo)
    {
        this.peso = peso;
        this.velocidad = velocidad;
        this.modelo = modelo;
    }
 
    
    //Metodos setter y getters de la clase hija

    public void setPeso(double peso) 
    {
        this.peso = peso;
    }

    public double getPeso() 
    {
        return peso;
    }

   
    public void setVelocidad(float velocidad) 
    {
        this.velocidad = velocidad;
    }
    public float getVelocidad()
    {
        return velocidad;
    } 

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
