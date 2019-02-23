package tienda;

import java.util.Scanner;

public class Manejador {

    Scanner sc = new Scanner(System.in);
    ClienteCheque clienteCheque;
    ClienteEfectivo clienteEfectivo;
    ClienteCredito clienteCredito;

    public Manejador() {
        clienteCheque = new ClienteCheque();
        clienteEfectivo = new ClienteEfectivo();
        clienteCredito = new ClienteCredito();
    }

    private void ImpresionClienteCheque() { 
        System.out.println("\n\n\n\n\n\n\n\n3.Cliente pago cheque");
            System.out.print("Nombre: ");
            clienteCheque.setNombres(sc.next());
            System.out.print("Apellido: ");
            clienteCheque.setApellidos(sc.next());
            System.out.print("Direccion: ");
            clienteCheque.setDireccion(sc.next());
            System.out.print("Nit: ");
            clienteCheque.setNit(sc.nextInt());
        clienteCheque.ingresarProducto();
        System.out.println("Total a pagar es: " + clienteCheque.getsubTotal());
        Menu();
    }//Metodo encargado de setear los valores heredados de clienteCheque, ingresar producto a clienteCheque y por ultimo, obtener subtotal de clienteCheque
    
    private void ImpresionClienteCredito() {
        System.out.println("\n\n\n\n\n\n\n\n2.Cliente pago credito");
            System.out.print("Nombre: ");
            clienteCredito.setNombres(sc.next());
            System.out.print("Apellido: ");
            clienteCredito.setApellidos(sc.next());
            System.out.print("Direccion: ");
            clienteCredito.setDireccion(sc.next());
            System.out.print("Nit: ");
            clienteCredito.setNit(sc.nextInt());
        clienteCredito.mPagos();
        System.out.println("Total a pagar es: " + clienteCredito.getsubTotal());
        Menu();
    }//Metodo encargado de setear los valores heredados de clienteCredito, ingresar producto a clienteCredito y por ultimo, obtener subtotal de clienteCredito

    private void ImpresionClienteEfectivo(){
        System.out.println("\n\n\n\n\n\n\n\n1. Cliente pago efectivo");
             System.out.print("Nombre: ");
            clienteEfectivo.setNombres(sc.next());
            System.out.print("Apellido: ");
            clienteEfectivo.setApellidos(sc.next());
            System.out.print("Direccion: ");
            clienteEfectivo.setDireccion(sc.next());
            System.out.print("Nit: ");
            clienteEfectivo.setNit(sc.nextInt());
        clienteEfectivo.ingresarProducto();
        System.out.println("Total a pagar es: " + clienteEfectivo.getsubTotal());
        Menu();
    }//Metodo encargado de setear los valores heredados de clienteEfectivo, ingresar producto a clienteEfectivo y por ultimo, obtener subtotal de clienteEfectivo
    
    private void generarCierre(){
        System.out.println("\n\n\n\n\n\n\n\nCierre del dia\n");
        if(clienteEfectivo.getTotal()>2500){
            System.out.println("1. Total de Efectivo: Q" + clienteEfectivo.getTotal());
            System.out.println("\nProceder a depositar el efectivo al banco");
        }else{
            System.out.println("1. Total de Efectivo: Q" + clienteEfectivo.getTotal());
        }
        if(clienteCheque.getTotal()>2500){
            System.out.println("2. Total de Cheque: Q" + clienteCheque.getTotal());
            System.out.println("\nProceder a depositar los cheques al banco");
        }else{
            System.out.println("2. Total de Cheques: Q" + clienteCheque.getTotal());
        }
        if(clienteCredito.getTotal()>2500){
            System.out.println("3. Total de Credito: Q" + clienteCredito.getTotal());
            System.out.println("\nProceder a depositar los creditos al banco");
        }else{
            System.out.println("3. Total de Credito: Q" + clienteCredito.getTotal());
        }
        System.out.println("-------------------------------------\n\n\n\n\n\n\n\n");
    }  //Metodo el cual muestra los valores totales por tipo de compra, esto por medio de los getters de cada tipo de compra
    
    public void Menu() {
        {

            int op;
            op = 0;
            do {               
                System.out.println("\n\n\n\n\n\n\n\n---------------------------------------------------");
                System.out.println("                  Bienvenido al sistema");
                System.out.println("---------------------------------------------------");
                System.out.println("1.Pago en efectivo");
                System.out.println("2.Pago al credito");
                System.out.println("3.Pago con cheque");
                System.out.println("4.Generar cierre");
                System.out.println("5.Salir");
                System.out.println("---------------------------------------------------");
                
                op = sc.nextInt();
                if (op == 1) {
                    System.out.println("");
                    ImpresionClienteEfectivo();
                } else if (op == 2) {
                    System.out.println("");
                    ImpresionClienteCredito();
                } else if (op == 3) {
                    System.out.println("");
                    ImpresionClienteCheque();                    
                }else if (op == 4) {
                    System.out.println("");
                    generarCierre();
                }else{
                    System.exit(0);
                }
            } while (op != 5);
               
        }

    }


}
