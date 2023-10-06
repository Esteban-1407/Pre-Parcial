package Problem_2;

import Problem_2.Interfaz.ILocal;
import Problem_2.dto.LocalDTO;
import Problem_2.service.LocalServicelmpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class LocalMain {
    public static void main(String[] args) throws  ClassNotFoundException, IOException {
        String opc = "1";
        ILocal repo = new LocalServicelmpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Actualizar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id by Local: ");
                    Integer id = s.nextInt();
                    System.out.println("Name of the local: ");
                    String nom = s.next();
                    System.out.println("Service hours: ");
                    String serv = s.next();
                    System.out.println("Category: ");
                    String cat = s.next();
                    repo.save(new LocalDTO(id,nom,serv,cat   ));
                    break;
                }
                case "2": {
                    List<LocalDTO> local = repo.findAll();
                    if(!local.isEmpty()){
                        local.forEach(System.out::println);
                    }else{
                        System.out.println("No hay registros");
                    }
                    break;
                }
                case "3": {
                    System.out.println("===== actualizar ====");
                    System.out.print("id  by local: ");
                    Integer idp = s.nextInt();
                    System.out.print("Name of the local: ");
                    String nom = s.next();
                    System.out.print("Enter the Service hours: ");
                    String cat = s.next();
                    System.out.print("Enter the category: ");
                    String ca = s.next();
                    LocalDTO beaActualizar = new LocalDTO(idp, nom, cat, ca);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (!opc.equals("5"));
    }
}
