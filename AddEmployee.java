/**
 *
 * @authors “posar els vostres noms”
 */

package jaumebalmes.employeestofile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class AddEmployee {
    
    public static void main (String[] args) throws Exception{
        
        Employee newEmployee = new Employee(); //instanciem newEmployee amb la classe //Employee
      
        File fitxer = new File("treballadors.txt"); //Objecte File on instanciem fitxer i creem el //nostre arxiu .txt per guardar les dades dels treballadors
        BufferedWriter llista = new BufferedWriter(new FileWriter(fitxer, true)); //Class PrintWriter per escriure les dades al //fitxer creat


        //Instanciar Scanner
        Scanner sc = new Scanner(System.in);

        //Posar variables necessàries per indicar si s’ha acabat o no el posar dades del //treballador
        boolean salida = false;
        boolean error;

        do{

        //Demanar el nom de l’empleat
            System.out.println("Introdueix el nom: ");
            newEmployee.setName(sc.nextLine());
            llista.write(newEmployee.getName()+"\n");

        //Demanar el cognom de l’empleat
            System.out.println("Introdueix els cognoms: ");
            newEmployee.setSurname(sc.nextLine());
            llista.write(newEmployee.getSurname()+"\n");

        //Demanar edat de l’empleat
            do{
                error=false;
                System.out.println("Introdueix l'edat: ");
                try{
                    newEmployee.setAge(Integer.parseInt(sc.nextLine()));
                }catch(Exception ex){
                    System.out.println("Error, procureu escriure un enter.\n");
                    error=true;
                }
            }while(error);
            llista.write(newEmployee.getAge()+"\n");

        //Demanar alçada de l’empleat
            do{
                error=false;
                System.out.println("Introdueix l'alçada: ");
                try{
                    newEmployee.setHeight(Float.parseFloat(sc.nextLine()));
                }catch(Exception ex){
                    System.out.println("Error, procureu escriure l'alçada amb el format xx.xx\n");
                    error=true;
                }
            }while(error);
            llista.write(""+newEmployee.getHeight()+"\n");

        //Demanar lloc de treball
            System.out.println("Introdueix el lloc de treball: ");
            newEmployee.setJob(sc.nextLine());
            llista.write(newEmployee.getJob()+"\n");

        //Demanar el salari
            do{
                error=false;
                System.out.println("Introdueix el salari: ");
                try{
                    newEmployee.setSalary(Double.parseDouble(sc.nextLine()));
                }catch(Exception ex){
                    System.out.println("Error, procureu escriure el salari amb el format xx.xx\n");
                    error=true;
                }
            }while(error);            
            llista.write(""+newEmployee.getSalary()+"\n");

        //Demanar si esta o no casat
            do{
                error = false;
                System.out.println("Introdueix si està casat/da (S/N): ");
                String c = sc.nextLine();
                if (c.equalsIgnoreCase("S"))
                    newEmployee.setMarried(true);
                if (c.equalsIgnoreCase("N"))
                    newEmployee.setMarried(false);
                if (!c.equalsIgnoreCase("S") && !c.equalsIgnoreCase("N")){
                    System.out.println("Respongui només amb 'S' o 'N'");
                    error = true;
                }
            }while(error);
            llista.write(""+newEmployee.isMarried()+"\n");

        //Preguntar si s’hi volen posar més empleats
            do{
                error = false;
                System.out.println("Vols introduir un altre treballador? (S/N)");
                String c = sc.nextLine();
                if (c.equalsIgnoreCase("N"))
                    salida = true;
                if (!c.equalsIgnoreCase("S") && !c.equalsIgnoreCase("N")){
                    System.out.println("Respongui només amb 'S' o 'N'");
                    error = true;
                }
            }while(error);
            
         } while (!salida);
        llista.close();

        //Tancar amb mètode close() les instàncies creades amb PrintWriter i Scanner

    }
}
