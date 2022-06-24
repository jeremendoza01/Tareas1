package tareajava;

public class Tarea {

    String name;
    String descripcion;

    //Constructores
    public Tarea(String name,String descripcion){
        this.name=name;
        this.descripcion=descripcion;
    }

    //Procedimientos
    public String mostrarTarea(){
        return this.name+" : "+this.descripcion+" : ";
    }
}

