package tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteCheque extends Cliente {

    private double total;//manejara el monto historico por modo de compra
    private double subTotal;//manejara el monto total de la compra en curso
    
    private final double MAX_COMPRA = 15000;//maximo para comprar en cheque

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = 0;
    }
    public double getsubTotal() {
        return subTotal;
    }

    public void setsubTotal() {
        this.subTotal = 0;
    }

    public void ingresarProducto() {
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
            
            total += valor * cantidad;
            subTotal += valor * cantidad;
            
            produ.add(prod);//ingresamos al arraylist el String producto para manejar el articulo que sale de la tienda
            compra(total);
            System.out.print("¿Desea agregar otro producto? S/N: ");
            opc = x.next();

        } while (!"N".equals(opc));
        
        System.out.println("---------------------------------------------------");
        System.out.println("Cantidad de productos comprados: " + produ.size());
        System.out.println("Total a pagar: " + subTotal);
        System.out.println("---------------------------------------------------");
 } 

    public void compra(double total) {

        if (total >= 15000) {
            System.out.println("usted no puede comprar con cheque mas de "
                    + "Q15,000.00");
            ingresarProducto();
        }
       
    }//Metodo que se encarga de limitar la compra, para que no pase de 15000 quetzales

}