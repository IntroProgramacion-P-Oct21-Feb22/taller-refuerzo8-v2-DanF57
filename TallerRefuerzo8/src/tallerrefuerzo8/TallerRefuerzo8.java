
package tallerrefuerzo8;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class TallerRefuerzo8 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     entrada.useLocale(Locale.US);
     
     //variables
     String nombreCliente;
     String cedula;
     String tipocomputadora;
     String salida;
     String cadena = "";
     
     int cantidad;
     int op; //tipo cliente
     int precio1 = 1000;
     int precio2 = 1100;
     int precio3 = 900;
     
     double descuento1 = 0.01;
     double descuento2 = 0.05;
     double descuento3 = 0.1;
     double descuento4 = 0.15;
     double subtotal = 0;
     double valortotal;
     double ventatotal = 0;
     boolean bandera = true;
     
     do {
     System.out.println("Ingrese el nombre del Cliente");
     nombreCliente = entrada.nextLine();
     System.out.println("Ingrese el numero de cédula del Cliente");
     cedula = entrada.nextLine();
     System.out.println("Ingrese el tipo de Cliente (0,1,2,3,4)");
     op = entrada.nextInt();
     entrada.nextLine();//limpieza de buffer
     System.out.println("Ingrese el tipo de computadora que desea(1,2,3) "
             + "1:$1000, 2:$1100, 3:$900 ");
     tipocomputadora = entrada.nextLine();
     System.out.println("Ingrese la cantidad de computadoras a comprar");
     cantidad = entrada.nextInt();
     
     if (tipocomputadora.equals("1")){
         subtotal = precio1;
     }else{
         if(tipocomputadora.equals("2")){
         subtotal = precio2;
         }else{
             if(tipocomputadora.equals("3")){
                 subtotal = precio3;
             }
         }
     }
      subtotal = subtotal * cantidad;
      switch(op){
           case 1:
                descuento1 = subtotal*descuento1 ;
                valortotal = subtotal - descuento1;
                break;
            
            case 2:
                descuento2 = subtotal*descuento2 ;
                valortotal = subtotal - descuento2;
                break;
                
            case 3:
                descuento3 = subtotal*descuento3 ;
                valortotal = subtotal - descuento3;
                break;
                
            case 4:
            descuento4 = subtotal*descuento4 ;
            valortotal = subtotal - descuento4;
            break;
                
            default:
                valortotal = subtotal;
                break;
      }
     ventatotal = ventatotal + valortotal;
     cadena = String.format("%sCliente de nombre %s, con cédula %s,\ncompra %s"
            + " computadoras con precio individual %.2f\n Total a pagar %.2f.\n"
             ,cadena
             ,nombreCliente
             ,cedula
             ,cantidad
             ,subtotal
             ,valortotal );
     
     entrada.nextLine();
     System.out.println("Ingrese si para mostrar reporte");
     salida = entrada.nextLine();
        if (salida.equals("si")){
            bandera = false;
        }
     } while (bandera);
     System.out.println(cadena);
     System.out.printf("Total venta de computadoras: %.2f\n",ventatotal);
     
    }
    
}
/*Cliente con Ana Gomez, con cédula 11001111, 
compra 1 computadoras con precio individual $1000. 
Total a pagar $1000 Cliente con Pedro Huertas, 
con cédula 21001111, compra 2 computadoras con precio individual $900. 
Total a pagar $1800

Total venta de computadoras: $2800*/