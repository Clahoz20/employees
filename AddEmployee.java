package jaumebalmes.employeestofile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * main per gestionar les creacions d'Employee i guardar/llegir info a fitxer
 * @author Roger
 */
public class AddEmployee {
    
    public static void main (String[] args) throws Exception{
        
        Employee[] personal = new Employee[3]; //Creem una array de 3 posicions de personal
      
        //Afegim els 3 elements a l'array personal
        personal[0] = new Employee ( "Ana", "Rebollo", 34, 178, "Enginyera Tècnica", 1700, false);
        
        //Completar els altres 2 empleats amb la info que vulgueu com fet amb l’anterior        
        personal[1] = new Employee ("Claudi", "Lahoz", 28, 176, "Actor", 700, false);
        personal[2] = new Employee ("Gerard", "Marimon", 21, 183, "Broker", 20000, false);
        //Construim fluse de dades d'ObjectOutputStream dintre de try-catch
                   
            //Creem fluxe de dades de l'objecte pel que viatjarà la info
            
            
            //Escriure l'objecte
           
                        
            //Tancar el fluxe
           
            
            
            //Recuperar l'objecte creat amb ObjectOutputStream
            
            
  //Creem un array per emmagatzemar l'objecte. Hem de fer casting ja que el readOPbject no es    //d'objecte Employye i la info que llegim la volem d'Employee

           
            
            //Tancar el fluxe
           

            //Utilitxem un bucle (foreach) per llegir l'array personal_recuperat ja que és un array
            
                     
       


    }
        
        
}
