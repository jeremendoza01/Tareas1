package tareajava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int tamano,menu;
        System.out.println("Ingresa el tamañao de tareas que quieras realizar");
        Scanner input= new Scanner(System.in);
        tamano=input.nextInt();
        Tarea[] listadoDeTareas = new Tarea[tamano];
        do {
            System.out.println("Ingrese 1 para cargar una tarea, 2 para mostrar la pantalla o 3 para salir");
            menu=input.nextInt();

            switch(menu){

                case 1: 
                System.out.print("Dime el nombre de la tarea ");
                String name=input.nextLine();
                System.out.print("Dime la descripcion de la tarea: ");
                String descripcion=input.nextLine();

                Tarea t1=new Tarea(name,descripcion);

                break;

                case 2:
                //Tarea t1=new Tarea(name,descripcion);
                System.out.print(Tt1.mostrarTarea());
                break;
            }  
        } while (menu!=3);
    }
}
