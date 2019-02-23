package tienda;

import java.io.File;
import java.util.Scanner;

public class Login {
public void run() {
    Scanner keyboard = new Scanner (System.in);
    System.out.print("Ingresar Usuario: ");
    String inpUser = keyboard.nextLine();
    System.out.print("Ingresar contrasena: ");
    String inpPass = keyboard.nextLine(); // 

    if (inpUser.equals("sporres") && inpPass.equals("pass")) {
        System.out.print("acceso autorizado\n\n\n\n");
    } else {
        System.out.print("acceso denegado, intente de nuevo\n");
        System.exit(0);
    }
}
} 
