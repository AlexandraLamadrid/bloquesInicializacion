package domain;

//Basicamente los bloques de inicializacion tenemos dos tipos, tenemos los bloques de inicializacion estaticos
//y bloques de inicializacion no estaticos. Ambos bloques se van a inicializar antes del constructor de la clase,
//y tambien antes de un bloque de inicializacion no estatico.
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //Vamos a definir un bloque de inicializacion estatico:
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10;sale error porque esta variable no es estatica.
    }
   
    //Lo importante es que este bloque de inicializacion se ejecuta antes del constructor de la clase.
    //Bloque de inicializacion NO estatico
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }            
}
