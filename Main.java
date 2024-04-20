import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Articulo> listaDeArticulos = new ArrayList<Articulo>();

    public static void main(String[] args) {
        menuPrincipal();


    }

    static void menuPrincipal() {
        int opcion = 0;
        Scanner sn = new Scanner(System.in);
        do {
            System.out.println("Bienvenido a la gestion de productos, a continuacion el menu ");
            System.out.println("1.Agregar producto");
            System.out.println("2.Mostrar lista de productos");
            System.out.println("3.Modificar un producto");
            System.out.println("0. Salir del sistema");
            try {
                opcion = sn.nextInt();

                if (opcion == 0) {
                    System.out.println("Que le vaya bien");
                }
                switch (opcion) {
                    case 1: {
                        agregarProducto();
                        System.out.println("Se ha añadido existosamente");
                        break;
                    }
                    case 2: {
                        mostrarListaProductos();
                        break;

                    }

                }

            } catch (InputMismatchException exception) {
                System.out.println("Ingrese una opcion valida");
                sn.nextInt();


            }

        }while (opcion != 0) ;
    }




            static int obtenerTipoProducto(){
        int opcion=0;
        Scanner sn= new Scanner(System.in);
        System.out.println("1.MOVIL");
        System.out.println("2.COMPUTADORA");
        try{
            opcion=sn.nextInt();
            if (opcion>1 && opcion<2) {


            }

        }catch(InputMismatchException e){
            System.out.println("Ingrese una opcion validad");

        }
        return opcion;


    }

    static void agregarProducto(){
        int tipoProducto=obtenerTipoProducto();
        Scanner sn= new Scanner(System.in);
        Articulo art=null;
       try{
           System.out.println("Ingrese el nombre del producto");
           String nombre=sn.nextLine();
           System.out.println("Ingrese el modelo del producto");
           String modelo=sn.nextLine();
           System.out.println("Ingrese la descripcion del producto");
           String descripcion=sn.nextLine();
           System.out.println("Ingrese el precio del producto");
           float precio= sn.nextFloat();


        art=new Articulo(nombre,modelo,descripcion,precio);
           switch (tipoProducto) {
               case 1:
                   System.out.println("Ingrese el pais donde se creo el celular");
                   String pais = sn.nextLine();
                   sn.nextLine();
                   System.out.println("Ingrese el SIM de su celular");
                   String idCel = sn.nextLine();
                   art = new Movil(art, pais, idCel);
                   break;

                   case 2:
                       System.out.println("Ingrese la marca de su laptop");
                       String marca = sn.nextLine();
                       sn.nextLine();
                       System.out.println("Ingrese el año en que se creo su laptop");
                       String año = sn.nextLine();
                       art = new Laptop(art, marca, año);

                       break;
                   }




       }catch(InputMismatchException e){
           System.out.println("Ingrese una opcion valida");

           listaDeArticulos.add(art);
}
}
static void mostrarListaProductos(){

    for (int i = 0; i < listaDeArticulos.size(); i++) {
       System.out.println("Nombre" +listaDeArticulos.get(i).getNombre());
        System.out.println("Modelo"+listaDeArticulos.get(i).getModelo());
        System.out.println("Descripcion"+listaDeArticulos.get(i).getDescripcion());
        System.out.println("Precio"+listaDeArticulos.get(i).getPrecio());


    }


    }
}