package lab5_alessandroreyes;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int cuenta;
    private int edad;
    private boolean genero;
    private Carrera carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int cuenta, int edad, boolean genero, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
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

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
