package caneta1;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class principal {

    public static void main(String[] args) throws FileNotFoundException {
     /* caneta1 caneta = new caneta1();
      
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("Informe o modelo: ");
      caneta.modelo = s.next();
      System.out.println("Informe a cor: ");
      caneta.cor = s.next();
      System.out.println("Informe a ponta: ");
      caneta.ponta = s.nextFloat();
      System.out.println("Informe a carga: ");
      caneta.carga = s.nextInt();
      
      caneta.tampada = true;
      int erro = caneta.tampar();
      if(erro>0){
          System.out.println("A caneta já está tampada!");
      }else{
      erro = caneta.destampar();
      if(erro>0) System.out.println("A caneta já está destampada!");
    }*/
     
    
    File Arquivo = new File("C:\\Users\\aluno\\Desktop/Arquivo.csv");
    
    try {
	Arquivo.createNewFile();
	System.out.print("Arquivo criado com sucesso!");
			
    } catch (IOException e) {
	e.printStackTrace();
}
   
       
     
    new frmCaneta().setVisible(true);
   
    }
    }  
