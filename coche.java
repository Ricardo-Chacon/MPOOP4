public class coche {
//seccion de atributos
  String color;
  String marca;
  int numPuertas;
  int año;
  int potencia;
  boolean automatico; 
//seccion de constructores
  public coche (){

  }
  public coche(String marca, int año, String color, int numPuertas, boolean automatico, int potencia){
    this.marca=marca;
    this.año=año;
    this.color=color;
    this.numPuertas=numPuertas;
    this.automatico=automatico;
    this.potencia=potencia;
  }
  //seccion de metodos 
  public void encender(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy encendiendo");
  }
  public void avanzar (boolean avanza){
  if(avanza){
    System.out.println("estoy avanzando a 10 km/h");
  }else{
    System.out.println("voy a 0 km/h");
   }
}
public void apagar(){
  System.out.println("Soy el coche de la marca "+marca+" y estoy apagandome");
}

public void frenar (boolean frena){
  if(frena){
    System.out.println("Estoy frenando");
  }else{
    System.out.println("no estoy frenando");
  }
}
public void abrirPuertas(int numPuertasAAbrir){
  if(numPuertasAAbrir > numPuertas){
    System.out.println("El numero de puertas a abrir es mayo al numero de puertas del coche");
  }else{
    System.out.println("Abriendo"+numPuertasAAbrir+ " puertas");
  }
}
@Override
public String toString(){
  return "coche("+"marca"+marca+"año"+año+"color"+color+"numPuertas"+numPuertas+"automatico"+automatico+"potencia"+potencia+")";
}
}
