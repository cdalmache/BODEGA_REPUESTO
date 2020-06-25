/*
 * IMPLEMENTAR UN ALGORITMO QUE ME PERMITA 
 */
package daniel.bodega_repuestosapp1;

/**
 *
 * @author Almache Cristian
 */
public class Bodega_Repuesto {
    
     //ATRIBUTOS
     private String repuesto;
     private int cantidad_disponible;
      // CONSTRUCTORES
     public Bodega_Repuesto(String repuesto){
    this(repuesto,0); //sobrecarga
}
     public Bodega_Repuesto(String repuesto, int cantidad_disponible){
         this.repuesto=repuesto;
         //Si la cantidad de repuestos es menor que cero, le ponemos  cero.
         if(cantidad_disponible<0){
             this.cantidad_disponible=0;
         }else{
             this.cantidad_disponible=cantidad_disponible;
         }
     }
    //METODOS
     
     public void setRepuesto(String repuesto){ //Set, modifica o almacena el valor de la variable.
         this.repuesto=repuesto;
     }
     public String getRepuesto(){ //get, muestra o extrae el valor del dato.
         return repuesto;
     }
    public void setCantidad_Disponible(int cantidad_disponible){
        this.cantidad_disponible=cantidad_disponible;
     }
    public int getCantidad_Disponible(){
        return cantidad_disponible;
    }
    
    /**INGRESAS REPUESTO A BODEGA*/
    
    
   public void Ingresar_Repuesto(int cantidad_disponible){
       if(cantidad_disponible>0){
           this.cantidad_disponible += cantidad_disponible;
       } 
   }
   
 //Devolver  respuestos a bodega.
 
   
   public void Devolver_Repuesto(int cantidad_disponible){
       if(cantidad_disponible<0){
           this.cantidad_disponible=cantidad_disponible;
           
       }else{
           this.cantidad_disponible -=cantidad_disponible;
       }
   }
     /*
   Devuelve el estado del Objeto
   */
   @Override
   public String toString(){
       return "EL REPUESTO "+ repuesto+" DISPONE DE:  "+cantidad_disponible+" ELEMENTOS DISPONIBLES   EN  LA BODEGA";
     }
}
 //CLASE EJECUTABLE

  class Bodega_RepuestosApp{
      public static void main(String[] args){
          Bodega_Repuesto repuesto1=new Bodega_Repuesto("CARBURADOR");
          Bodega_Repuesto repuesto2=new Bodega_Repuesto("BOMBA DE COMBUSTIBLE",56);
          
          
          //INGRESO DE REPUESTO A BODEGA
          repuesto1.Ingresar_Repuesto(56);
          repuesto2.Ingresar_Repuesto(100);
          
          //DEVOLVER RESPUESTO A BODEGA
          
          repuesto1.Devolver_Repuesto(40);
          repuesto2.Devolver_Repuesto(25);
          //PRESENTACION DE INFORMACION  DE ARTICULOS EN BODEGA
          System.out.println(repuesto1);
          System.out.println(repuesto2);
      }
  }
