
package javaapplication29;
import java.util.Arrays;

public class JavaApplication29 {

    public static void main(String[] args) {
        int[] array1={12,23,-22,0,43,545,-4,-55,43,12,0,-999,-87};
        int pozitivanBroj = 0;
        int negativanBroj = 0;
        
        for(int broj:array1){
         if (broj>0) {
            pozitivanBroj++;
        } else if(broj<0){
            negativanBroj++;
        }else{System.out.println();
        }
          }
        int [] pozitivanNiz = new int [pozitivanBroj];
        int [] negativanNiz = new int [negativanBroj];
        
             int a = 0;
             int b = 0;
             
             for(int broj:array1){
             if(broj>0){
                 pozitivanNiz[a] = broj;
                 a++;
             }else if (broj<0){
                 negativanNiz[b] = broj;  
                 b++;
             }else{ System.out.println("Ovo je nula");
               }
              }
             
             System.out.println("Pozitivan niz:" + Arrays.toString(pozitivanNiz));
             System.out.println("Negativan niz:" + Arrays.toString(negativanNiz));
             
              Arrays.sort(array1);
              System.out.println("Duplikati");
             for (int i = 0; i < array1.length -1; i++) { 
               if (array1[i + 1 ] == array1[i]) {
                 System.out.println("Duplikat:" + array1[i]);
                   i = i + 1;
                    }
                   }
             
              }
            }
    

