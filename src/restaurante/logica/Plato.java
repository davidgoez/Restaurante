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

