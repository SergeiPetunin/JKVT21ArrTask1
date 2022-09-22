/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrtask;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author spetu
 */
public class ArrTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrNumbers = new int[20];
        Random rand = new Random();
        for(int i = 0;i < arrNumbers.length; i++) {
            arrNumbers[i] = (rand.nextInt(5)+1)*2;//random numbers 0..99  
        }
        Arrays.sort(arrNumbers);
        System.out.println(Arrays.toString(arrNumbers));
        //-----------------------------------------------
        System.out.println("");
        int maxNumber = arrNumbers[0];
        for (int i = 1; i < arrNumbers.length; i++){
            if(arrNumbers[i] > maxNumber){
                maxNumber = arrNumbers[i];
            }
        }
        System.out.println("Max number is " + maxNumber);
        int minNumber = arrNumbers[0];
        for (int i = 0; i < arrNumbers.length; i++){
            if(arrNumbers[i] < maxNumber){
                maxNumber = arrNumbers[i];
            }
        }
        System.out.println("Min number is " + maxNumber);
        //-------------------AverageAll----------------------------
        double average = 0;
        for (double a : arrNumbers) {
            average += a;
        }
        System.out.println("Среднее арифметическое " + average / arrNumbers.length);
        System.out.println("");
        //------------------Average - min - max
        int[] arrNumbersCopy = new int[arrNumbers.length-2];
        System.arraycopy(arrNumbers,1, arrNumbersCopy,0, arrNumbers.length-2);
        System.out.println(Arrays.toString(arrNumbersCopy));
        
        double average1 = 0;
        for (double a : arrNumbersCopy) {
            average1 += a;
        }
        System.out.println("Среднее арифметическое без учёта минимального и максимального " + average1 / arrNumbersCopy.length);
        
        
    }   
    
}
