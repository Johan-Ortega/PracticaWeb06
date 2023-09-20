
package org.uv.practicaweb06;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


@Named(value = "calculadoraBean")
@SessionScoped
public class CalculadoraBean implements Serializable {

    /**
     * Creates a new instance of CalculadoraBean
     */
    public CalculadoraBean() {
    }
    
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public void sumar(){
        int c=a+b;
        mensaje(String.valueOf(c));
    }

    public void mensaje(String msg){
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Resultado", msg));

    }
}