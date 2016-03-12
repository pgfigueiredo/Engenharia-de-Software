package ListaL;

public class No{
	private Info info;
	private No proximo;
	
	public No(Info x){
		info = x;
		proximo = null;
	}
	
	public No getProximo(){
		return this.proximo;
	}
	
	public void setProximo(No prox){
		this.proximo = prox;
	}
	
	public Info getInfo(){
		return this.info;
	}
	
	public void setInfo(Info x){
		this.info = x;
	}
}
