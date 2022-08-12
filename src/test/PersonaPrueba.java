
package test;

import domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Karla"); //Si el contadorPersona no fuera static este siempre se reiniciaria ya que estaría asociado a la clase y no al objeto
        System.out.println("persona2 = " + persona2);
    }
}
