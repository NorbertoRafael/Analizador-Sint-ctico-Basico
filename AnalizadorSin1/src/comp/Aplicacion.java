package comp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Aplicacion {
	
	public static void main(String[] args) {
		
		
		String [] tokenclases = new String [10];
		String linea;
		int lineaN=0;
		Analisis analisis = new Analisis();
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      StringTokenizer tokens;
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("archivoEntrada.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         
	         while((linea=br.readLine())!=null){
	        	 tokens = new StringTokenizer(linea,",");
	        	 lineaN+=1;
	        	 //analisis.setBAND(true);
	        	 
	 		for (int i=0; i<tokenclases.length&&tokens.hasMoreTokens();i++) {
	 			tokenclases[i] = tokens.nextToken();
	 		}
	        	 
	        	// System.out.println(tokenclases[0]+tokenclases[1]+tokenclases[2]+tokenclases[3]+tokenclases[4]);
	        	 
	        	 analisis.synTipoVariable(tokenclases);
	        	 
	        	 if(!analisis.isBAND()){
	        	 
	        	 analisis.AsignarExpresion(tokenclases);
	        	 
	        	 if(!analisis.isBAND()){
	        	 
	        	 analisis.AsignarVector(tokenclases);
	        	 if(!analisis.isBAND()){
	        	 
	        	 analisis.CondicionalIf(tokenclases);
	        	 if(!analisis.isBAND()){
	        		 System.out.println("Error en la linea: "+lineaN);
	        	 }
	        	// else System.out.println("Sin errores");
	        	 }
	        	// else System.out.println("Sin errores");
	        	 }
	        	// else System.out.println("Sin errores");
	        	 }
	        	// else System.out.println("Sin errores");	        	 
	        	 
	        	 
	         }

	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }	

	      

	}
	
	
}
