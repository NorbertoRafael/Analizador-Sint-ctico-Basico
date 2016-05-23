package comp;

public class Analisis {
	
	private boolean BAND;
	
	public void synTipoVariable(String [] TokenClass){
		BAND=true;
		int i=0;
		String TipoVariable []={"Tipo_Dato","variable",";"};
		do{
		if(!TipoVariable[i].equals(TokenClass[i])){
			BAND=false;	
			
		}
		else i+=1;
		}while(i<TipoVariable.length && BAND==true);
		
	}
	
	public void AsignarExpresion(String [] TokenClass){
		BAND=true;
		int i=0;
		String asiganarExpresion []={"variable", "=","expresion", ";"};
		do{
		if(!asiganarExpresion[i].equals(TokenClass[i])){
			
			BAND=false;			
		}	
		else i+=1;
		}while(i<asiganarExpresion.length && BAND==true);
	}
	
public void AsignarVector(String [] TokenClass){
		BAND=true;
		int i=0;
		String asiganarVector []={"vector", "[","expresion", "]", "=", "expresion", ";"};
		do{
		if(!asiganarVector[i].equals(TokenClass[i])){
			
			BAND=false;			
		}	
		i+=1;
		}while(i<asiganarVector.length && BAND==true);
	}
	
public void CondicionalIf(String [] TokenClass){
	BAND=true;
	int i=0;
	String condicionalIf []={"if", "(","expresion", ")", "then", "comando", ";"};
	do{
		
	if(!condicionalIf[i].equals(TokenClass[i])){
		
		BAND=false;		
	}	
	
	i+=1;
	}while(i<condicionalIf.length && BAND==true);
	
}

public boolean isBAND() {
	return BAND;
}

public void setBAND(boolean bAND) {
	BAND = bAND;
}





}
