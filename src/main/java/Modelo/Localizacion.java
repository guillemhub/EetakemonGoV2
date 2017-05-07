package Modelo;

public class Localizacion {

    private int id;
    private String nombre;
    private double latitud;
    private double longitud;

    public Localizacion(String nombre, double latitud, double longitud)
    {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Localizacion [Id=" + id + ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + "]";
    }
}
