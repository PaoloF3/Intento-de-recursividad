/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Recursividad;
/**
 *
 * @author solo1
 */
public class Revez {
    
    private int num;
    private int invertido;

    /**
     *
     * @param num
     * @param invertido

     */
    public Revez(int num, int invertido) {
        this.num = num;
        this.invertido = invertido ;

    }
    
    public void setInvertido(int invertido) {
        this.invertido = invertido;
    }
    
        public int getInvertido() {
        return invertido;
    }
   
    public void setNum(int num) {
        this.num = num;
    }
 
    public int getNum() {
        return num;
    }


    public int Invertidos(int num, int invertido){
        if (num>0){
            return 0;
        }
        else{
            int Resto = num%10;
            num = num/10;
            invertido = (invertido*10)+Resto;
            return Invertidos(num,invertido);
            
            
            
            }

    
    }
}