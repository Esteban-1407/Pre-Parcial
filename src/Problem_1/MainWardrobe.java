package Problem_1;

public class MainWardrobe {
    public static void main(String[] args) {
        WardrobeService blusa = WardrobeService.BLUSA;
        WardrobeService jean = WardrobeService.JEAN;
        WardrobeService camisa = WardrobeService.CAMISA;
        WardrobeService camiseta = WardrobeService.CAMISETA;
        System.out.println("Descripcion de la blusa");
        System.out.println(blusa.toString());

        System.out.println("Descripcion del jean");
        System.out.println(jean.toString());

        System.out.println("Descripción de la camiseta");
        System.out.println(camiseta.toString());

        System.out.println("Descripcion de la camisa");
        System.out.println(camisa.toString());

    }
}
