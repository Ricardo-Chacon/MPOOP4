/**
* @author Ricardo Chacon
*/

public class Main {
  public static void main(String[] args) {
    
    coche coche1 = new coche();
    coche1.año=2020;
    coche1.automatico=true;
    coche1.color="blanco";
    coche1.marca="nissan";
    coche1.numPuertas=5;
    coche1.potencia=150;
    coche1.encender();
    coche1.avanzar(true);
    coche1.frenar(true);
    coche1.apagar();
    coche1.abrirPuertas(4);
   
    System.out.println("##########");
    coche coche2= new coche("Mazda", 2021,"negro",3, false , 200);
     coche2.encender();
    coche2.avanzar(false);
    coche2.frenar(false);
    coche2.apagar();
    coche2.abrirPuertas(5);

    System.out.println("##########");
    System.out.println(coche1);
    System.out.println(coche2);
     
     System.out.println("##############");
     Perro perro1= new Perro("Rex",(float)5.8,2,6,"Chihuahua",false);//to cas o casteo

     Perro perro2= new Perro("firulais",6.4f,6,10,"doberman",true);//misma funcion que el casteo 

     System.out.println(perro1);
     System.out.println(perro2);

System.out.println("#######Actividad extra#######");
Profe profe1 = new Profe("Javier","Electrotecnia","Universidad Nacional Autonoma de Mexico",8,true);
profe1.carrera("Sistemas");
profe1.enseña("virtual");
profe1.sueldo(3500);
profe1.trabajo(45);
profe1.paro(true);

System.out.println(profe1);

  }
}