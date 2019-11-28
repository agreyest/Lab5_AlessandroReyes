package lab5_alessandroreyes;

public class Carrera {
    private String nombre;
    private String facultad;
    private int costo;
    private String jefe;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, int costo, String jefe) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costo = costo;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
