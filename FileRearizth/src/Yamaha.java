/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Yamaha {
    public static void main(String[] args) {
        SepedaMotor motor = new SepedaMotor();
        motor.inputMerk("yamaha");
        System.out.println("Merk motor ini adalah "+ motor.tampilMerk());
    }
}
