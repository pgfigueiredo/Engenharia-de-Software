package ListaL;

public class Banana extends Info{
	Banana b;
	private String cor;
	private String tipo;
	
	public Banana(String c, String t){
		this.cor = c;
		this.tipo = t;
	}
	
	public void setCor(String c){
		this.cor = c;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setTipo(String t){
		this.tipo = t;
	}

	public String getTipo(){
		return this.tipo;
	}
	
	public void setBanana(String c, String t){
		this.cor = c;
		this.tipo = t;
	}
	
	public Banana getInfo(){
		b.cor = this.cor;
		b.tipo = this.tipo;
		System.out.println(b.cor);
		System.out.println(b.tipo);
		return b;
	}
}
