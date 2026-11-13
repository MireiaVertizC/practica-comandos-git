/**
 * Rama de gestión de personas
 *
 * @author Mireia Vertiz Conde
 * @version 1.0
 */
package gestionPersonas;

/**
 * @param nombre Nombre de la persona (String)
 * @param edad Edad de la persona (int)
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Getter del nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre
     * @param nombre Nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de edad
     * @return edad La edad de la persona (int)
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter de edad
     * @param edad La edad de la persona (int)
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Muestra la información en modo String
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}