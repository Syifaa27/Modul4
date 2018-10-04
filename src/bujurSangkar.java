/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class bujurSangkar extends bangunDatar{
    private double sisi;
    public bujurSangkar(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
return 4 * sisi;
    }

    @Override
    public double hitungLuas() {
return sisi * sisi;
    }
    
}
