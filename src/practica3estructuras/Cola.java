package practica3estructuras;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;

    public Cola() {
    }
    
    public void encola(Nodo d){
        if(frente == null){  // significa que la cola esta vacia
            frente = d;
            ultimo = d;
        } else{
            ultimo.setAtras(d);
            ultimo=d;
        }
    }
    
    public Nodo atiende(){
        Nodo aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    
    @Override
    public String toString(){
        String s="";
        Nodo aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
