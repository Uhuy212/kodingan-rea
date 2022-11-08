
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Segitiga {
    String alas ,tinggi;
    public void input(){
        alas = JOptionPane.showInputDialog("masukan alas: ");
        tinggi = JOptionPane.showInputDialog("masukan tinggi: ");
        hasil();
    }
    public double hitung(){
        long a = Long.parseLong(alas);
        long t = Long.parseLong(tinggi);
        return (0.5*a*t);
    }
    public void hasil(){
        
        JOptionPane.showMessageDialog(null,"0.5 *"+"a"+"+"+"t"+"=" + hitung());
    }
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        segitiga1.input();
        
    }
}
