
package calculadora;

import java.text.ParseException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class Exercicio {
    
    public static void main(String[] args) {
        //Declaração de variáveis.
       Calendar data = Calendar.getInstance();  
       Robo robo = new Robo();
       Menu painel = new Menu();
        try {
            robo.setDataDeFab("16/02/2000");
            robo.setValorDaBateria(10);
        } catch (ParseException ex) {
            Logger.getLogger(Exercicio.class.getName()).log(Level.SEVERE, null, ex);
        }
       painel.abrirMenu(robo);
      
    }
}
