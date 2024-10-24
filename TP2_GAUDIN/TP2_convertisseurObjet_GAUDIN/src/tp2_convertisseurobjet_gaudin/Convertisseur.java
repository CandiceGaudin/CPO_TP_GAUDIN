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
    int nbConversions= 0 ;

    public double CelciusVersKelvin (double tCelcius) {
        nbConversions++;
        double tKelvin;
        tKelvin = tCelcius + 273.15;
        return tKelvin;
        
}
    public double KelvinVersCelcius (double tKelvin) {
        nbConversions++;
        double tCelcius;
        tCelcius = tKelvin - 273.15;
        return tCelcius;
    
}
    public double CelciusVersFarenheit (double tCelcius) {
        nbConversions++;
        double tFarenheit;
        tFarenheit =(tCelcius  * (9/5)) + 32;
        return tFarenheit;
    
}
    public double FarenheitVersCelcius (double tFarenheit) {
        nbConversions++;
        double tCelcius;
        tCelcius =(tFarenheit - 32) * (5/9);
        return tCelcius;
    
}
    public double KelvinVersFarenheit (double tKelvin) {
        nbConversions++;
        double tFarenheit;
        tFarenheit =(tKelvin - 273.15) * (9/5) + 32;
        return tFarenheit;
    
}
    public double FarenheitVersKelvin (double tFarenheit) {
        nbConversions++;
        double tKelvin;
        tKelvin =(tFarenheit - 32) * (5/9) + 273.15;
        return tKelvin;
    
}
    
    @Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

}
  
    
    


