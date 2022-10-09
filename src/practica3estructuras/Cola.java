package practica3estructuras;

import javax.swing.JOptionPane;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;

    public Cola() {
    }
    
    public void encola(Persona persona){
        
        Nodo nodito = new Nodo();
        nodito.setPersona(persona);
        nodito.setAtras(null);
        
        if (ColaVacia()){
            frente = nodito;
            ultimo = nodito;
        }else if(persona.isDiscapacidad()){
            nodito.setAtras(frente);
            nodito = frente;
        }
        else{
            ultimo.setAtras(nodito);
            ultimo = nodito;
        }
    }
    
    public boolean ColaVacia(){
        if (frente==null){
            return true;
        }else {
            return false;
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
    
   
    
    //SEARCH DE PILAS
//    public boolean search(int reference) {
//        // Crea una copia de la pila.
//        Node aux = cima;
//        // Bandera para verificar si exist el elemento a search.
//        boolean exist = false;
//        // Recorre la pila hasta llegar encontrar el node o llegar al final
//        // de la pila.
//        while (exist != true && aux != null) {
//            // Compara si el value del node es igual que al de reference.
//            if (reference == aux.getValor()) {
//                // Cambia el value de la bandera.
//                exist = true;
//            } else {
//                // Avanza al siguiente node.
//                aux = aux.getSiguiente();
//            }
//        }
//        // Retorna el value de la bandera.
//        return exist;
//    }
    
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
