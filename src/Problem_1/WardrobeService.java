package Problem_1;

public enum WardrobeService {

    BLUSA("Prenda de mujer","Blusa de color azul",1),
    JEAN("Prenda de mujer", "Jean ajustado de color negro",2),
    CAMISETA("Prenda de hombre","Camiseta formal",3),
    CAMISA("Prenda de hombre","Camisa informal",4);

    private String nombre;
    private String descripcion;
    private  int ubicacion;
    WardrobeService(String nombre,String caracteristicas, Integer casilla) {
        this.nombre = nombre;
        this.descripcion = caracteristicas;
        this.ubicacion = casilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return
                "nombre:" + nombre + '\'' +
                ", descripcion:" + descripcion + '\'' +
                ", ubicacion:" + ubicacion;
                }
    }

