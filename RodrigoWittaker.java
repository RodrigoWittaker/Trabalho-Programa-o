/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

/**
 *
 * @author internet
 */
public class Carro {
 //Atributos 
 //Tipo & Nome;
 //String nome;
 //Int idade;   
    
private String chassi;
private String cor;
private String modelo;


    public String getChassi() {
        return chassi;
    }
    /**
     * Este método recebe o Chassi do Carro
     * 
     * @param chassi 
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }
   /**
    * Este método recebe o Cor do Carro
    * 
    * @param cor 
    */
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
    /**
     * Este método recebe o modelo do Carro
     * 
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

        
    }

/*

//Gettes ans Setters

public void setChassi(String chassi){
    this.chassi = chassi;
}
public String getChassi(){
    return chassi;
}
public void setCor (String cor){
    this.cor = cor;
}
public String getCor (){
    return cor;
}   
public void setModelo (String modelo){
    this.modelo = modelo;
}
public String getmodelo (){
    return modelo;
*/



/////////////////////

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

/**
 *
 * @author internet
 */
public class PrimeiraAplicacao {

    /**
     * @param args the command line arguments
     * @to do
     *
     */
    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;
//
//        System.out.println(a + b);
//        System.out.println(a + a);
//        System.out.println(b - a);

     Carro meuCarro = new Carro();
     
          
     meuCarro.setChassi("A123B");
     meuCarro.setCor  ("Azul");
     meuCarro.setModelo ("UNO");
     
        System.out.println("CHASSI: "+meuCarro.getChassi());
        System.out.println("COR: "+meuCarro.getCor());
        System.out.println("MODELO: "+meuCarro.getModelo());
//
// TODO code application logic here
    }

}
