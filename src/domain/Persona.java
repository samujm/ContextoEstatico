
package domain;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++; //no se recomienda ocupar el operador this para acceder a las variables static ya que estas variables se asocian con la clase, se ocupa el nombre de la clase
        this.idPersona = Persona.contadorPersonas; //Se asigna el valor ya incrementado
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
    public void sedIdPersona(int idPersona){
        this.idPersona = idPersona;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
    
    public static void setContadorPersonas(int contadorPersonas){
        contadorPersonas = contadorPersonas;
    }
 
    @Override
    public String toString(){
        return "Persona [" + "idPersona: " + idPersona +
                ", nombre: " + nombre +
                " ]";
    }
}
