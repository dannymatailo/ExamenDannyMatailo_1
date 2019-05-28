/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendannymatailo;

/**
 *
 * @author labctr
 */
public class DatosPersona {
    String Nombre;
    int Edad;
    float Peso;
    float Altura;
    float indmasacor;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
        public DatosPersona() {
    }

    public DatosPersona(String Nombre, int Edad, float Peso, float Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Altura = Altura;
        
    }
    public float MasaCorporal(){
       this.indmasacor= (Peso/(Altura*Altura))  ;          
               return (Peso/(Altura*Altura));
      
    }
    public String MostrarEstado(){
        if (indmasacor<16){
         return ("Muy debajo del peso corporal");
        }
         else if (indmasacor>=16.1 && indmasacor<=18.4 ){
                   return ("bajo peso");
                   }
        else if (indmasacor>=18.5 && indmasacor<=25 ){
                   return ("peso normal");
                   }
        else if (indmasacor>=25.1 && indmasacor<=30 ){
                   return ("con sobrepeso");
                   }
        else if (indmasacor>=30.1 && indmasacor<=40 ){
                   return ("Obeso");
                   }
         else {
         return ("Obesidad severa");
        }
        
    }
    
}
