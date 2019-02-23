
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteCredito extends Cliente{
    
    private double Total;//manejara el monto historico por modo de compra
    private double subTotal;//manejara el monto total de la compra en curso
    
    private final double MAX_COMPRA = 5000;

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = 0;
    }
    
    public double getsubTotal() {
        return subTotal;
    }

    public void setsubTotal(double subTotal) {
        this.subTotal = 0;
    }
    
 public void mPagos(){
     subTotal = 0;//subTotal se inicia a 0 para el manejo de la cuenta actual
    ArrayList<String> produ = new ArrayList<>();//ArrayList que maneja unicamente los productos, que van saliendo por compraEfectivo
    String opc = "S";
     do{
            
            Scanner x = new Scanner(System.in);
            int cantidad = 0;//Variable que guardara la cantidad de productos ingresados por el usuario
            String prod;//Variable que guardara el produto ingresado por el usuario
            Double valor;//variable que guardara el precio del producto ingresado por el usario
            
            System.out.print("Ingrese producto: ");
            prod = x.nextLine();
            System.out.print("Ingrese precio del producto: Q");
            valor = x.nextDouble();
            System.out.print("Ingrese cantidad del producto: ");
            cantidad = x.nextInt();
            
            Total += valor * cantidad;
            subTotal += valor * cantidad;
            
            produ.add(prod);//ingresamos al arraylist el String producto para manejar el articulo que sale de la tienda
            
            compra(Total);
            System.out.print("¿Desea agregar otro producto? S/N: ");
            opc = x.next();
                             
        } while (!"N".equals(opc));
        
        System.out.println("---------------------------------------------------");
        System.out.println("Cantidad de productos comprados: " + produ.size());
        System.out.println("Total a pagar: " + subTotal);
        System.out.println("---------------------------------------------------");
 }   
 
 public void compra(double total) {

        if (total >= 5000) {
            System.out.println("No puede comprar con credito mas de "
                    + "Q5,000.00");
            mPagos();
        }
 }//Metodo que se encarga de limitar la compra de 5000 

    
}


