
package domain;


public class test {


    public static void main(String[] args) {
        //Empleado em1= new Empleado("Luis",45000);
        //determinarTipo(em1);
        
        //Gerente gerente1 = new Gerente("Liz", 80000, "IT");
        //determinarTipo(gerente1);
        //System.out.println(gerente1.mostrarDetalles());
       
        Empleado em2;
        //em2 = new Escritor("Liz", 85000, TipoEscriitura.CLASICO);
       
        
    }
    
    public static void determinarTipo(Empleado empleado){
        Gerente gerente=(Gerente) empleado;
        if (empleado instanceof Gerente){
            System.out.println("Empleado es de tipo gerente");
            //((Gerente) empleado).getDepartamento();
        }else if(empleado instanceof Empleado){
            System.out.println("Empleado es de tipo empleado");
        }else if(empleado instanceof Object){
            System.out.println("Empleado es de tipo Object");
        }
    }
    
}
