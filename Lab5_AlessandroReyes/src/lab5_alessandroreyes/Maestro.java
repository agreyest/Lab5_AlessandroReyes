package lab5_alessandroreyes;

import java.util.ArrayList;

public class Maestro {
    private String nombre;
    private String apellido;
    private int salario;
    private int edad;
    private ArrayList<Clase> clases = new ArrayList();

    public Maestro() {
    }

    public Maestro(String nombre, String apellido, int salario, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    public void setClase(Clase clase) {
        this.clases.add(clase);
    }
    @Override
    public String toString() {
        return nombre;
    }
    
}
