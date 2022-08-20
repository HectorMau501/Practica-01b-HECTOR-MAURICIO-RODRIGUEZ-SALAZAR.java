
package POO;


public class Tren extends Transporte
{
    private String modelo;
    private String tipoCarga;
    private float velocidad;

    public Tren(String modelo, String tipoCarga, float velocidad, float altura, String color, float gastoGasolina) {
        super(altura, color, gastoGasolina);
        this.modelo = modelo;
        this.tipoCarga = tipoCarga;
        this.velocidad = velocidad;
    }

    public void setModelo(String modelo) {
    this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setTipoCarga(String tipoCarga) 
    {
        this.tipoCarga = tipoCarga;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

   
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    public float getVelocidad() {
        return velocidad;
    }

    
    
    
    
    
    
}
