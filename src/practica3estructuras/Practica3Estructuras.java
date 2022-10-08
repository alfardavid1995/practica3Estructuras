/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3estructuras;

import javax.swing.JOptionPane;

/**
 *
 * @author css124646
 */
public class Practica3Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        boolean seguir = true;
        Cola colita = new Cola();
        
        do{
            int selector=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Seleccion de menu principal:"
                    + "1.Insertar persona"
                    + "2.Verificar cola"
                    + "3.Atender persona"
                    + "4.Buscar Persona"
                    + "5.Salir"));
            
            switch(selector){
                case 1:
                    Persona personita= crearPersona();
                    colita.encola(null, personita);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
           
        }while(seguir);
    }        
    /**
     *
     * @return
     */
    public static Persona crearPersona(){
        String nombre = null;
        int cedula = 0;
        boolean discapacitado = false;
        
        do{
            int seleccion=Integer.parseInt(JOptionPane.showInputDialog(
            "Crear persona:\n"
            + "Tiene que tener una cedula valida y el nombre\n"
            + "1.Digite el nombre de la persona\n"
            + "2.Digite la cedula de la persona\n"
            + "3.verificar"));
            
            /*
                
            
            */  
            switch(seleccion){
                case 1:
                    nombre=JOptionPane.showInputDialog(
                            "Digite el nombre de la persona");
                    break;
                case 2:
                    cedula = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite el numero de cedula"));
                    break;
                case 3:
                    String info= "valor cedula: " + cedula+ "\n"
                            + "valor persona: "+ nombre ;
                    JOptionPane.showMessageDialog(null, info);
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Digite una opcion valida");
                    break;         
            }
            JOptionPane.showInputDialog("");
            
            /*
            
            
            */
            if(nombre!= null || cedula !=0){
                JOptionPane.showMessageDialog(null, "El usuario es valido");
                int selectorDiscapacitado=Integer.parseInt(
                        JOptionPane.showInputDialog(
                        "El usuario es disacapacitado:\n"
                        + "1.si\n"
                        + "2.no\n"));
                switch(selectorDiscapacitado){
                    case 1:
                        discapacitado = true;
                        break;
                    case 2:
                        discapacitado = false;
                        break;
                    default:
                        discapacitado = false;
                        break;
                        
                }
            }else if(nombre== null){
                JOptionPane.showMessageDialog(null,"Digite un nombre para la persona");  
            }else if (cedula == 0){
                JOptionPane.showMessageDialog(null,"Digite una cedula para la persona");
            } 
            
            
        }while (nombre!= null || cedula !=0);
        
        Persona personita = new Persona(nombre, cedula, discapacitado);
        return personita;
    }
               
                     
}
