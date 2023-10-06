package Problem_1;

public class MainHairSalon {
    public static void main(String[] args) {
        // Se crearon instancias de cada elemento de la enumeración
        HairSalonService corte =   HairSalonService.CORTE;
        HairSalonService uñas =   HairSalonService.UÑAS;
        HairSalonService tinte =  HairSalonService.TINTE;

        // Se muestra la descripción de cada servicio
        System.out.println("\n Descripción del servicio de corte:");
        corte.mostrarDescripcionServicio();
        System.out.println("\nDescripción del servicio de uñas:");
        uñas.mostrarDescripcionServicio();
        System.out.println("\nDescripción del servicio de tinte:");
        tinte.mostrarDescripcionServicio();
    }

}
