
package caneta1;


public class caneta1 {
    String modelo,cor,tamp; 
    float ponta;
    int carga;
    boolean tampada;
    
    public String Escrever(){
        return "Escrevendo...";
    }
    public int tampar(){
        int erro = 0;
    if(!tampada){
        tampada = true;
       
    }else{
        erro = 1;
    }
    return erro; 
  }  
   
    public int destampar(){
        int erro = 0;
    if(tampada){
        tampada = false;
       
    }else{
        erro = 1;
    }
    return erro;
    }

    @Override
    public String toString() {
        return "caneta1{" + "modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", carga=" + carga + ", tampada=" + tampada + '}';
    }

}                 