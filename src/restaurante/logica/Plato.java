/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.logica;

import restaurante.logica.acompañante.Acompañante;
import restaurante.logica.base.Base;
import restaurante.logica.bebida.Bebida;


/**
 *
 * @author Estudiantes
 */
public class Plato {


        Bebida bb;
        Acompañante a;
        Base b;

    public Bebida getBb() {
        return bb;
    }

    public void setBb(Bebida bb) {
        this.bb = bb;
    }

    public Acompañante getA() {
        return a;
    }

    public void setA(Acompañante a) {
        this.a = a;
    }

    public Base getB() {
        return b;
    }

    public void setB(Base b) {
        this.b = b;
    }
        
        
   
    }

   
   /*

   public void imprimir(){
=======

    public void imprimir(){
>>>>>>> 07bc268580e0aed8f2ae2d3776ac96e038faa4bf
    
        int j1;
        int j2;
        String x;
<<<<<<< HEAD
        String j;
=======
>>>>>>> 07bc268580e0aed8f2ae2d3776ac96e038faa4bf
        
        
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
<<<<<<< HEAD
                    
=======
>>>>>>> 07bc268580e0aed8f2ae2d3776ac96e038faa4bf
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
                
<<<<<<< HEAD
    }
*/


    

    

