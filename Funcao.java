package trabalho;

import trabalho.Estrutura;

public class Funcao<T> extends Estrutura<T> {
	
	public Funcao(){
		super();
	}
	
	public Funcao(int capacidade){
		super(capacidade);
	}
	
	public void empilha(T elemento){
		super.adiciona(elemento);
	}
	
	public T topo(){
		
		if (this.estaVazia()){
			return null;
		} 
		
		return this.elementos[tamanho-1];
	}
	
	public T desempilha(){
		
		if (this.estaVazia()){
			return null;
		}
	
		return this.elementos[--tamanho];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
