
public class Perro{
  String nombre;
  float peso;
  int edadaños;
  int edadmeses;
  String raza;
  boolean macho;

  public Perro(){

  }
  public Perro(String nombre,float peso, int edadaños, int edadmeses, String raza, boolean macho){
    this.nombre=nombre;
    this.peso=peso;
    this.edadaños=edadaños;
    this.edadmeses=edadmeses;
    this.raza=raza;
    this.macho=macho;

  }
  public void comer(String comida){
    System.out.println("Soy "+nombre+" y estoy comiendo "+comida);
  }
  public void ladrar(boolean ladrar){
    if(ladrar){
      System.out.println("Estoy ladrando");
    }else{
      System.out.println("No estoy ladrando");

    }
  }
  public void jugar(String juego){
    System.out.println("Estoy jugando a "+juego);
  }
public void dormir( int minutos){
  System.out.println("He estado durmiendo por "+minutos+" minutos");
}
  public void pasear(String lugar){
    System.out.println("Voy a pasear a "+lugar);
  }
@Override
public String toString(){
  return "Perro ("+"nombre= "+nombre+" peso= "+peso+" edadaños= "+edadaños+" edadmeses= "+edadmeses+" raza= "+raza+" macho= "+macho+")";
  
}
}