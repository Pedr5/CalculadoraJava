package calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Menu implements ActionListener{
    
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JButton botaoSoma = new JButton("Adição");
        JButton botaoSubtracao = new JButton("Subtração");
        JButton botaoDivisao = new JButton("Divisão");
        JButton botaoMultiplicacao = new JButton("Multiplicação");
        JPanel panel = new JPanel();
        String op;
        JLabel resultado = new JLabel();
        JLabel bateria = new JLabel();
        Robo robo = new Robo();
        double var1, var2;
        public Menu(){
            panel.setLayout(new GridLayout(6,1));
            panel.add(new JLabel("Primeiro numero: "));
            panel.add(num1);
            //panel.add(Box.createHorizontalStrut(15)); // a spacer
            panel.add(new JLabel("Segundo numero: "));
            panel.add(num2);
            panel.add(new JLabel("Resultado: "));
            panel.add(resultado);
            panel.add(new JLabel("Bateria: "));
            panel.add(bateria);
            //panel.add(Box.createHorizontalStrut(15));
            panel.add(botaoSoma);
            panel.add(botaoSubtracao);
            panel.add(botaoDivisao);
            panel.add(botaoMultiplicacao);
            //panel.add(Box.createHorizontalStrut(15));
            botaoSoma.addActionListener(this);
            botaoSubtracao.addActionListener(this);
            botaoDivisao.addActionListener(this);
            botaoMultiplicacao.addActionListener(this);

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
            var1 = Double.parseDouble(num1.getText());
            var2 = Double.parseDouble(num2.getText());
            }catch(NumberFormatException f){
                JOptionPane.showMessageDialog(panel, "Digite apenas números!", "ALERTA", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(robo.getValorDaBateria() == 0){ 
               JOptionPane.showMessageDialog(panel, "Bateria Insuficiente!", "Alerta", JOptionPane.WARNING_MESSAGE);
               return;
            }
            
            if (e.getActionCommand().equals("Adição")){     
                resultado.setText("" + robo.operacao.adicao(var1, var2));
            }
            if (e.getActionCommand().equals("Subtração")){
                resultado.setText("" + robo.operacao.subtracao(var1, var2));
            }
            if (e.getActionCommand().equals("Divisão")){
                resultado.setText("" + robo.operacao.divisao(var1, var2));
            }
            if (e.getActionCommand().equals("Multiplicação")){
                resultado.setText("" + robo.operacao.multiplicacao(var1, var2));
            }
            robo.gastarBateria();
            bateria.setText("" + robo.getValorDaBateria());
        }
        public String abrirMenu(Robo robot){
            this.bateria.setText("" + robot.getValorDaBateria());
            this.robo = robot;
            JOptionPane.showConfirmDialog(null, this.panel, "Robô Calculadora", JOptionPane.PLAIN_MESSAGE);
        return op; 
        }
        
        
}
