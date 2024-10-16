/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_gaudin;

import java.util.Scanner;

/**
 *
 * @author kango
 */
public class Convertisseur {
    int nbConversions;
    double a;
    int conversion;
    double reponse;
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin;
        tKelvin = tCelcius + 273.15;
        return tKelvin;
        
}
    public static double KelvinVersCelcius (double tKelvin) {
        double tCelcius;
        tCelcius = tKelvin - 273.15;
        return tCelcius;
    
}
    public static double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit;
        tFarenheit =(tCelcius  * (9/5)) + 32;
        return tFarenheit;
    
}
    public static double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius;
        tCelcius =(tFarenheit - 32) * (5/9);
        return tCelcius;
    
}
    public static double KelvinVersFarenheit (double tKelvin) {
        double tFarenheit;
        tFarenheit =(tKelvin - 273.15) * (9/5) + 32;
        return tFarenheit;
    
}
    public static double FarenheitVersKelvin (double tFarenheit) {
        double tKelvin;
        tKelvin =(tFarenheit - 32) * (5/9) + 273.15;
        return tKelvin;
    

}
  
    
    
}

