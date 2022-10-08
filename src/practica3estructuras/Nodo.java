package practica3estructuras;

public class Nodo {
    private Persona persona;
    private Nodo atras;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "persona=" + persona +
                ", atras=" + atras +
                '}';
    }
}
