package ListaL;

public class Aluno extends Info {
	Aluno al;
	String nome;
	String ra;
	
	public Aluno(String n, String r){
		this.nome = n;
		this.ra = r;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
	
	public String getNome(Aluno a){
		return a.nome;
	}
	
	public void setRA(String r){
		this.ra = r;
	}

	public String getRA(Aluno a){
		return a.ra;
	}	
	
	public void setAluno(String n, String r){
		this.nome = n;
		this.ra = r;
	}
	
	public Aluno getInfo(){
		al.nome = this.nome;
		al.ra = this.ra;
		System.out.println(al.nome);
		System.out.println(al.ra);
		return al;

	}
	
}
