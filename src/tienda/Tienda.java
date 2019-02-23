
package tienda;


public class Tienda {

  
    public static void main(String[] args) {
    
        Login login = new Login();
        login.run();     
        Manejador manejador = new Manejador();
        manejador.Menu();
    }

}
