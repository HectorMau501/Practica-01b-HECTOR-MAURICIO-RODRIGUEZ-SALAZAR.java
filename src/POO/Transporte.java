
package POO;

//Clase padre
public class Transporte
{
    //Atributos
    private float altura;
    private String color;
    private double gastoGasolina;

    //Metodo constructor
    public Transporte() {}
    
    //Metodos Setters y Getters
    public void setAltura(float altura) 
    {
        this.altura = altura;
    }
    
    public float getAltura()
    {
        return altura;
    }

    public void setColor(String color) 
    {
    this.color = color;
    }
    
    public String getColor() 
    {
        return color;
    }

    public void setGastoGasolina(double gastoGasolina) 
    {
        this.gastoGasolina = gastoGasolina;
    }

    public double getGastoGasolina() 
    {
        return gastoGasolina;
    }

   
    
    
    
}
