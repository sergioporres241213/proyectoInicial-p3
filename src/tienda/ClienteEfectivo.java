
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteEfectivo extends Cliente{

    private double total;
    private double subTotal;
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(){
        this.total = 0;
    }
    
    public double getsubTotal(){
        return subTotal;
    }
    
    public void setsubTotal(){
        this.subTotal = 0;
    }
    
    public void ingresarProducto(){
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
            
            total += valor * cantidad;
            subTotal += valor * cantidad;
            
            produ.add(prod);
            
            System.out.print("¿Desea agregar otro producto? S/N: ");
            opc = x.next();
                             
        } while (!"N".equals(opc));
        
        System.out.println("---------------------------------------------------");
        System.out.println("Cantidad de productos comprados: " + produ.size());
        System.out.println("Total a pagar: " + subTotal);
        System.out.println("---------------------------------------------------");
 }
}
        
    

