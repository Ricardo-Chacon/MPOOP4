public class Profe{
  String nombre;
  String MateriaAImpartir;
  String LugarDeTrabajo;
  int antiguedad;
  boolean vacunado;
  public Profe(){

  }
  public Profe(String nombre, String MateriaAImpartir, String LugarDeTrabajo, int antiguedad, boolean vacunado){
    this.nombre=nombre;
    this.MateriaAImpartir=MateriaAImpartir;
    this.LugarDeTrabajo=LugarDeTrabajo;
    this.antiguedad=antiguedad;
    this.vacunado=vacunado;
  }
  public void carrera(String carrera){
    System.out.println("Soy el profesor "+nombre+" y estudie la ingenieria en "+carrera);
  }
  public void enseña(String modo){
    System.out.println("En este ciclo escolar, impartire mis clases de manera "+modo);
    }
 public void sueldo(int dinero){
   System.out.println("Actualmente gano "+dinero+" pesos a la quincena");
 }
 public void trabajo(int horas){
   System.out.println("Trabajo un total de "+horas+" horas a la semana");
 }
 public void paro(boolean paro){
   if (paro){
     System.out.println("Por lo regular me parecen justas las razones por las cuales se genera un paro de labores");
   }else{
     System.out.println("Nunca he estado deacuerdo con el paro de actividades en la universidad");
   }
 }
 @Override
 public String toString(){
   return "Profe ("+"nombre = "+nombre+" materia a impartir = "+MateriaAImpartir+" Lugar de trabajo = "+LugarDeTrabajo+" antiguedad en años = "+antiguedad+" vacunado = "+vacunado+")";

 }
}