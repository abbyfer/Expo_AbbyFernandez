/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicion_abbyfernandez;

/**
 *
 * @author afern
 */
import java.util.Scanner;
public class Exposicion_AbbyFernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        Tipo libro1=new Tipo("Onyx Storm", "Rebecca Yarros", "disponible", "Fantasia", 2025);
        Tipo libro2=new Tipo("Harry Potter 1", "J.K Rowling", "rentado", "Fantasia", 1997);
        Tipo libro3=new Tipo("Silent Patient", "Alex Michaelides", "disponible", "Misterio", 2019);
        Tipo libro4=new Tipo("Malibu Rising", "Taylor Jenkins Reid", "rentado", "Fiction",2021);
        Rentador rentador=new Rentador("Mariah", "Hernandez", "08012005202670", 20, 0);
        Tipo[] libros = {libro1, libro2, libro3, libro4};
        int op;
        System.out.println("Bienvenido a la libreria virtual: "+rentador.getNombre());

        //mensaje de bienvenida y menu de opciones
        do{
        System.out.println("------Menu-----");
        System.out.println("1) ver libros disponibles");
        System.out.println("2) rentar un libro");
        System.out.println("3) libros sin devolver");
        System.out.println("4) salir");
        System.out.println("Ingrese una opcion: ");
        op=sc.nextInt();
        switch(op){
            case 1: 
                //corre el arreglo he imprime los libros que estan marcados disponibles
                System.out.println("Libros disponibles: ");
                    for(int i=0;i<libros.length;i++){
                        if (libros[i].getEstado().equals("disponible")) {
                            System.out.println(libros[i].getNombre());
                        }
                    }
                    break;
            case 2: 
                //muestra todos los libros y su estado(disponible o rentado) y les asigna un numero
                 System.out.println("Seleccione un libro:");
                for (int i=0; i<libros.length;i++){
                    System.out.println((i+1)+")"+libros[i].getNombre());
                    System.out.println("Estado: "+libros[i].getEstado());
                }
                //solicita el numero al usuario
                System.out.print("Ingrese el numero del libro: ");
                int ops = sc.nextInt();
                sc.nextLine();
                //verifica su estado, si disponible lo renta
                if(ops>=1 && ops<=libros.length){
                    Tipo libroSeleccionado = libros[ops-1];
                    if(libroSeleccionado.getEstado().equals("disponible")) {
                        libroSeleccionado.setEstado("rentado");
                        rentador.setRentados(rentador.getRentados()+1);
                        System.out.println("Rentaste un libro!");
                    } else {
                        System.out.println("No esta disponible");
                    }
                }               
                break;
            case 3:
                //muestra que libros no estan en la libreria
                System.out.println("Libros sin devolver:");
                    boolean renta=false;
                    for(int i=0;i<libros.length;i++){
                        if (libros[i].getEstado().equals("rentado")) {
                            System.out.println(libros[i].getNombre());
                            renta=true;
                        }
                    }
                    if(!renta){
                        System.out.println("Todos los libros estan en la libreria");
                    }
                    break;
           //termina el programa
            default: 
               break;
                    
        } 
        }while(op!=4);
        
    }
    
}
