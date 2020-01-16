package PRIMA;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta es la clase, donde se hace el calculo del prima.
 * @author Jimmy Celly
 *
 */
public class primaGradle {
	/*
	 * Variables estaticas,donde se guardan los varoles definidos para el calculo del prima.
	 */
	public static final Map<Integer,Float> FactorEdad = new HashMap<Integer, Float>();
    public static final Map<Integer,Integer> PtsAPerder = new HashMap<Integer, Integer>();
    public static final Map<Integer,Integer> ReducirSeguro = new HashMap<Integer, Integer>();
    
    static{
        FactorEdad.put(25,2.8F);
        FactorEdad.put(35,1.8F);
        FactorEdad.put(45,1.0F);
        FactorEdad.put(65,0.8F);
        FactorEdad.put(91,1.5F);
        
        PtsAPerder.put(25,1);
        PtsAPerder.put(35,3);
        PtsAPerder.put(45,5);
        PtsAPerder.put(65,7);
        PtsAPerder.put(91,4);
        
        ReducirSeguro.put(25,50);
        ReducirSeguro.put(35,50);
        ReducirSeguro.put(45,100);
        ReducirSeguro.put(65,150);
        ReducirSeguro.put(91,200);
	        
	}
    /**
     * Metodo que permite calcular el valor del prima.
     * @param edad - valor ingresado por el usuario
     * @param puntos - valor ingresado por el usuario
     * @return - retorna un valor entero con el resultados de la operación
     */
    public  double prima(int edad, int puntos)
    {

    	   double prima=0;
           if(edad>17 && edad<91){
               if(puntos>0 && puntos<31){
                   
                   if(edad<25){
               
                       if(puntos>= 30-PtsAPerder.get(25)){

                           prima = 500  * FactorEdad.get(25) - ReducirSeguro.get(25);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }
                       else{
                           prima = 500  * FactorEdad.get(25);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }
               
                   }
                   
                   else if(edad<35){
           
                       if(puntos>= 30-PtsAPerder.get(35)){

                           prima = 500  * FactorEdad.get(35) - ReducirSeguro.get(35);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }
                       else{
                           prima = 500  * FactorEdad.get(35);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }
                   }

                   else if (edad < 45 ){

                       if(puntos>= 30-PtsAPerder.get(45)){

                           prima = 500  * FactorEdad.get(45) - ReducirSeguro.get(45);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }
                       else{
                           prima = 500  * FactorEdad.get(45);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }
                   }

                   else if(edad<65) {

                       if(puntos>= 30-PtsAPerder.get(65)){

                           prima = 500  * FactorEdad.get(65) - ReducirSeguro.get(65);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }
                       else{
                           prima = 500  * FactorEdad.get(65);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }

                   }

                   else{

                       if(puntos>= 30-PtsAPerder.get(91)){

                           prima = 500  * FactorEdad.get(91) - ReducirSeguro.get(91);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }
                       else{
                           prima = 500  * FactorEdad.get(91);
                           System.out.println("Prima: $" + prima + "\n");
                           return prima;

                       }

                   }
                   
               }
               
               else{       
                   
                   System.out.println("Puntos fuera de rango");
                   return 0;
               
               }
               
           }
           
           else{
           
               System.out.println("Edad fuera de rango");
               return 0;
           
           }

           

    }
}
