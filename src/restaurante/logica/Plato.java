/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.logica;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;
import restaurante.logica.acompañante.Acompañante;
import restaurante.logica.acompañante.Carbohidrato;
import restaurante.logica.acompañante.Ensalada;
import restaurante.logica.base.Arroz;
import restaurante.logica.base.Base;
import restaurante.logica.base.Proteina;
import restaurante.logica.bebida.Bebida;
import restaurante.logica.bebida.Gaseosa;
import restaurante.logica.bebida.Jugo;

=======
>>>>>>> 4ddd24967104fa3edc7012166e84495ee6be48fd
/**
 *
 * @author Estudiantes
 */
public class Plato {
<<<<<<< HEAD
   
    Bebida bb;
    Acompañante a;
    Base b;
    


    public void imprimir(){
    
        int j1;
        int j2;
        String x;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Que le gustaria tomar");
        System.out.println("1--Jugo");
        System.out.println("2--Gaseosa");
        j1 = sc.nextInt();
       

        switch (j1) {
            case 1:
                bb = new Jugo();
                System.out.println("mango");
                System.out.println("mora");
                System.out.println("lulo");
                j2 = sc.nextInt();
                switch(j2){
                    case 1:
                        x=bb.mango;
                        break;
                    case 2:
                        x=bb.mora;
                        break;
                    case 3:
                        x=bb.lulo;
                        break;
                    default:
                        break;
                }
                
                break;
                
            case 2:
                bb = new Gaseosa();
                System.out.println("1--coca cola");
                System.out.println("2--sprite");
                System.out.println("3--pepsi");
                j2 = sc.nextInt();
                
                switch(j2){
                    
                    case 1:
                        x=bb.cocacola;
                        break;
                    case 2:
                        x=bb.sprite;
                        break;
                    case 3:
                        x=bb.pepsi;
                        break;
                    default:
                        break;
                
                }
                break;
                
                
        }
                
       
    
    }
    }

    

=======

    
   
    
}
>>>>>>> 4ddd24967104fa3edc7012166e84495ee6be48fd