
import java.util.Scanner;
/**
 * Problema de transporte  * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: Ktransporte(Kilos a transportar)
        // 1. Definicion de variables
        // Datos de entrada
        double Ktransporte;
    
        // Datos de salida
        double viajenec;
        double galones_viaje, costo_gasolina;
      
        
        //Variables adicionales
        double Kviaje = 18000; // Kilos por viaje
        double Pgasolina = 10000; // galon de gasolina 10000 pesos
        double Kbog_sasaima = 80; // 80km es la distancia entre Bogota y Sasaima aprox. 
        
        
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("¿Cuantos kilos desea transportar?");
        Ktransporte = teclado.nextDouble();
       
        
        
        // 2. Realizar calculos
        // cantidad de viajes necesarios
        viajenec = Ktransporte / Kviaje;
        int iviajenec = (int)viajenec; // Poder convertir la variable de double a entero
        
        // Consumo de combustible del camion (camion pesado de 2 ejes)
        galones_viaje = (52 / Kbog_sasaima)*10; // consumo de combustible 
        
        //Precio gasolina
        costo_gasolina = (galones_viaje * Pgasolina) * iviajenec;
       
       
       
       
       // 3. Mostrar datos de salida
        System.out.println("Cantidad de viajes" + iviajenec);
        System.out.println("Galones que gasta por viaje" + galones_viaje);
        System.out.println("Costo del combustible $" + costo_gasolina);
                                 
      
         
  } //Fin de la clase principal
}