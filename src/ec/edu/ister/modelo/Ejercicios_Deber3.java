/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfonso
 */
public class Ejercicios_Deber3 {
    
    public static void ejercicio1(){
        
        JOptionPane.showMessageDialog(null, "EJERCICIO NUMERO UNO");
        int[] n={0,1,0,-1};
        for (int a = 1; a < n.length; a++)
            if( n[a]==0&&n[a-1]!=0 ){
                int x=n[a-1];
                n[a-1]=n[a];
                n[a]=x;
                JOptionPane.showMessageDialog(null,"El resultado es"+n[2]);
            }
     
             
    }

    public static void ejercicio2(){
        JOptionPane.showMessageDialog(null, "EJERCICIO NUMERO DOS");
      int x=0;
        do {            
         JOptionPane.showMessageDialog(null,"El resultado es"+x); 
         x++;
         
        } while (x>0);
       
      
    }
    public static void ejercicio3(){
        JOptionPane.showMessageDialog(null, "EJERCICIO NUMERO TRES");
        
        for(int a=1; a<6; a+=2){
            for( int j=0 ; j<3 ;j++){
                if ( a+j>4 )
                    break;
                JOptionPane.showMessageDialog(null, "el resultad es"+ (a+j));
            }
        }
    }
    public static void ejercicio4(){
        JOptionPane.showMessageDialog(null, "EJERCICIO NUMERO CUATRO");
        int[] primes={1,3,6};
        int sum=0;
        for(int t:primes){
            sum+=t;
        }
        JOptionPane.showMessageDialog(null, "el resultad es"+(sum++));
    }
    public static void ejercicio5(){
        JOptionPane.showMessageDialog(null, "EJERCICIO NUMERO CINCO");
        
        int total=0;
        for( int a=0 ; a<=5 ; a++ ){
            total+=2;
        }
      JOptionPane.showMessageDialog(null, "el resultad es"+ total);  
    }
    public static void ejercicio6(){
        JOptionPane.showMessageDialog(null, "EJERCICIO NUMERO SEIS");
        
        
        JOptionPane.showMessageDialog(null, "----------  1  ----------");
        //1---------
        for ( int a=1 ;a<=100 ; a++ )
            if(a%5==0&&a%25==0)
                JOptionPane.showMessageDialog(null, "el resultad es"+ a + ",");
       
         JOptionPane.showMessageDialog(null, "----------  2  ----------");
         //2---------
         for( int a=1 ; a<=100  ;a++  )
             if( a%75==0 )
              JOptionPane.showMessageDialog(null, "el resultado es"+ a + ",");
                
    }
    
public static void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("INGRESE EL NUMERO DE LA OPCION A REALIZAR\n\n"
               + "MENU OPCIONES\n\n"
               + "1) Ejercicio N.-1\n"
               + "2) Ejercicio N.-2\n"
               + "3) Ejercicio N.-3\n"
               + "4) Ejercicio N.-4\n"
               + "5) Ejercicio N.-5\n"
               + "6) Ejercicio N.-6\n"
               + "7) SALIR--->\n\n"));
       
        
       switch(op){
           
           case 1:
               ejercicio1();
               break;
           case 2:
               ejercicio2();
               break;
           case 3:
               ejercicio3();
               break;
           case 4:
               ejercicio4();
               break;
           case 5:
               ejercicio5();
               break;
           case 6:
               ejercicio6();
               break;  
          
          
           
       }
    } while (op>=7);
    
}
    
    
}
