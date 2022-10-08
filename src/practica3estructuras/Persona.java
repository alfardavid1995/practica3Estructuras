
package practica3estructuras;


public class Persona {
   
    private String nombre;
    private int cedula;
    private boolean discapacidad;

    public Persona(String nombre, int cedula, boolean discapacidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.discapacidad = discapacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Persona:\n " +
                "nombre: " + nombre +
                ", cedula: " + cedula +
                ", discapacidad:" + discapacidad;
    }
}
