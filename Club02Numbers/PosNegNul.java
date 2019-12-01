/**
 * La clase PosNegNul, determina si un numero ingresado es Cero, Positivo o negativo.
 * @author  Díaz Ruiz Alejandro
 * @version 1.0
 * @since   2019-12-01
 */
public class PosNegNul{
    /**
     * Constructor de la clase PosNegNul heredado de Object.
     * @param null Sin parámetros.
     */
    public PosNegNul(){
        
    }
    
    /**
     * Método que determina si el numero es cero, negativo, o positivo.
     * @param num Único parámetro del método determina de tipo double.
     * @return Nothing.
     */
    public static void determina(double num){
        /** Entra a la condición si num es igual a cero*/
        if (num == 0) StdOut.print("Numero "+num+" = Cero\n"); 
        /** Entra a la condición si num es menor que cero*/
        if (num  < 0) StdOut.print("Numero "+num+" = Negativo\n");
        /** Entra a la condición si num es mayor que cero*/
        if (num  > 0) StdOut.print("Numero "+num+" = Positivo\n");
    }
    
    /**
     * Método main que usa el método determina.
     * @param args sin usar.
     * @return Nothing.
     */
    public static void main(String [] args){
        /**
         * Uso del método determina(), mediante el cual se asignan
         * diferentes números para comprobar su buen funcionamiento.
         */
        determina(0); 
        determina(-43);
        determina(43);
        determina(-43.43);
    }
}