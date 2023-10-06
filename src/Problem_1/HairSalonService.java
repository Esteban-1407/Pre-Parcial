package Problem_1;

public enum HairSalonService {
    CORTE("Corte de cabello", "Servicio de corte de cabello", 25),
    UÑAS("Manicura y pedicura", "Servicio de uñas", 10),
    TINTE("Tinte de cabello", "Servicio de tinte para el cabello", 40);

    // Atributos para cada enum constante
    private String nombre; // Nombre del servicio
    private String descripción; // Descripción del servicio
    private Integer precio; // Precio del servicio

    // Constructor privado para inicializar los atributos
    private HairSalonService(String nombre, String descripción, Integer precio) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
    }

    // Métodos para acceder a los atributos de cada enum constante
    public String getNombre() {
        return nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public Integer getPrecio() {
        return precio;
    }

    // Método para mostrar la descripción del servicio en la consola
    public void mostrarDescripcionServicio() {
        System.out.println("Nombre del servicio: " + nombre);
        System.out.println("Descripción: " + descripción);
        System.out.println("Precio: $" + precio);
    }
}
