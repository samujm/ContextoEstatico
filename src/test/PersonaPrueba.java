package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        //System.out.println("persona1 = " + persona1); sustituimos por el metodo imprimir

        Persona persona2 = new Persona("Karla"); //Si el contadorPersona no fuera static este siempre se reiniciaria ya que estaría asociado a la clase y no al objeto
        //System.out.println("persona2 = " + persona2); sustituimos por el metodo imprimir

        //Mandar llamar el metodo imprimir
        imprimir(persona1); //marca un error ya que el metodo no es static
        imprimir(persona2); //IMPORTANTE!!! Si estamos mandando llamar metodos dentro de un metodo statico tambien ese otro medoto debe ser static
        //IMPORTANTE!!! NO PODEMOS UTILIZAR THIS EN UN METODO STATICO YA QUE EL CONTEXTO ESTATICO NO PUEDE ACCEDER AL DINAMICO
    
        //contador = 20;//Una variable statica no puede ser referenciada desde un contexto estatico
    }

    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona); //Se imprime el objeto persona
    }
    
    //Metodo dinamico
    public int getContador(){ //este metodo no es estatico entonces desde este metodo podemos acceder a la variable contador sin problema
        //Mandar llamar el metodo statico imprimir
        imprimir(new Persona("Carlos")); //Manda llamar el metodo imprimir con un nuevo objeto de tipo persona
        return this.contador;
    }
} 