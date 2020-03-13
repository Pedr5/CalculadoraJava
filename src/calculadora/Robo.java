/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Robo {
    
    private String nome;
    Date dataDeFab;
    private int valorDaBateria;
    Operacao operacao = new Operacao();
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeFab() {
        return dataDeFab;
    }

    public void setDataDeFab(String data) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");        
        this.dataDeFab = f.parse(data);
    }

    public int getValorDaBateria() {
        return valorDaBateria;
    }

    public void setValorDaBateria(int valorDaBateria) {
        this.valorDaBateria = valorDaBateria;
    }
    
    public void gastarBateria(){
        this.valorDaBateria -= 1;
    }
    public Robo(){
        
    }
    
       
}
