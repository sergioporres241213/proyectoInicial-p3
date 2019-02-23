
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteCredito extends Cliente{
    double Total;
    double subTotal;
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
    subTotal = 0;
    ArrayList<String> produ = new ArrayList<>();
    String opc = "S";
     do{
            
            Scanner x = new Scanner(System.in);
            int cantidad = 0;
            String prod;
            Double valor;
            
            System.out.print("Ingrese producto: ");
            prod = x.nextLine();
            System.out.print("Ingrese precio del producto: Q");
            valor = x.nextDouble();
            System.out.print("Ingrese cantidad del producto: ");
            cantidad = x.nextInt();
            
            Total += valor * cantidad;
            subTotal += valor * cantidad;
            
            produ.add(prod);
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
 }

    
}


