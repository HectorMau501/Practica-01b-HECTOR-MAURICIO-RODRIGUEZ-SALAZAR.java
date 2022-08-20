
package POO;


public class Transporte
{
    private float altura;
    private String color;
    private float gastoGasolina;

    public Transporte(float altura, String color, float gastoGasolina) {
        this.altura = altura;
        this.color = color;
        this.gastoGasolina = gastoGasolina;
    }

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

    public void setGastoGasolina(float gastoGasolina) 
    {
        this.gastoGasolina = gastoGasolina;
    }

    public float getGastoGasolina() 
    {
        return gastoGasolina;
    }

   
    
    
    
}
