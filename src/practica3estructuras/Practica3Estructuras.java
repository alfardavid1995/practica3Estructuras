package practica3estructuras;

import javax.swing.JOptionPane;

/**
 *
David Alfaro
Mariana Alvarez
Alejandro Méndez
Gustavo Marin
 */
public class Practica3Estructuras {

    public static void main(String[] args) {
        // TODO code application logic
        boolean seguir = true;
        Cola colita = new Cola();
//se crean los botones del menu principal
        String[] botones = {"Insertar persona", "Mostar cola",
                "Atender persona", "Buscar Persona", "Salir"};

        do{
            int opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una de las siguientes opciones:",
                    "Programa Colas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones, botones[0]);

            switch(opcion){
                case 0:
                    Persona personita= crearPersona();// se crea una persona 
//                    con todos los parametros
                    colita.encola(personita);
                    break;
                case 1:
                    if(colita.ColaVacia()){
                           JOptionPane.showMessageDialog(null,"La cola está vacía");
                    }else{
                        JOptionPane.showMessageDialog(null, colita.toString());
                    }
                    
                    break;
                case 2:
                    colita.atiende();
                    
                    break;
                case 3:
                    int n=Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite la cedula del usuario que desea buscar"));
                   colita.search(n); 
                    break;
                case 4:
                    seguir = false;
                    break;
            }
           
        }while(seguir);
    }        
  
    public static Persona crearPersona(){
        String nombre;
        int cedula = 0;
        boolean discapacitado = false;
        String[] botones = {"No", "Sí"};

          nombre=JOptionPane.showInputDialog(
                            "Digite el nombre de la persona");
          
        if (nombre==null){
            nombre=JOptionPane.showInputDialog("No se permiten espacios en "
                    + "blanco, digite el nombre de la persona");
        }else{
            cedula = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite el numero de cedula"));
        }
        
        if (cedula==0){
             nombre=JOptionPane.showInputDialog("No se permiten espacios en "
                     + "blanco, digite el numero de cedula de la persona");
        }

        int opcion = JOptionPane.showOptionDialog(null,
                "El usuario es discapacitado:",
                "Programa Colas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                botones, botones[0]);

        if(opcion==1){
            discapacitado = true;
        }else{
            discapacitado = false;
        }
                       
        Persona personita = new Persona(nombre, cedula, discapacitado);
        return personita;
    }
               
                     
}
