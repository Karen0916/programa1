package mayusculas;

import javax.swing.*;
public class Mayusculas {

    
    public static void main(String[] args) {
        
     String   a ;
        
        a= JOptionPane.showInputDialog (null, "Ingrese una letra");
        
          if(a.compareTo(a.toLowerCase())==0){ //MINUSCULA 
                  a=a.toUpperCase(); 
        JOptionPane.showMessageDialog(null,"La letra ingresada es minÃºscula "); 
}  else{ 

JOptionPane.showMessageDialog(null,a); 
} 
JOptionPane.showMessageDialog(null,"WIII SI FUNCIONA!"); 


} 

}

