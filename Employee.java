/*
 Objecte Empleat
 */
package jaumebalmes.employeestofile;
import java.io.Serializable;
/**
 *
 * @author Claudi && Gerard
 */

public class Employee implements Serializable{
    
    //<editor-fold defaultstate="collapsed" desc="ARTIBUTS">
    String name;
    String surname;
    int age;
    float height;
    String job;
    double salary;
    boolean married;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    public Employee(){
        
    }
    
    public Employee(String name){
        this.name = name;
    }
    
    public Employee (String name, String surname, int age, int height, String job){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.job = job;
    }
 
    public Employee (String name, String surname, int age, int height, String job, double salary, boolean married){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.job = job;
        this.salary = salary;
        this.married = married;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS && SETTERS">
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String newSurname){
        surname = newSurname;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public float getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public boolean isMarried() {
        return married;
    }
    
    public void setMarried(boolean married) {
        this.married = married;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Employee{" + "name: " + name + ", surname: " + surname + ", age: " + age + ", height: " + height + ", job: " + job + ", salary: " + salary + ", married: " + married + '}';
    }
      
}
