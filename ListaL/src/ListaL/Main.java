package ListaL;

public class Main {
	public static void main(String args[]){
		 Lista L1 = new Lista();
		 L1.inserir(new Aluno("ze", "123"));
		 L1.inserir(new Aluno("mane", "456"));

		 //Aluno a1 = (Aluno)L1.buscar(1);
		 //Aluno a2 = (Aluno)L1.buscar(0);

		 Lista L2 = new Lista();
		 L2.inserir(new Banana("verde", "nanica"));
		 L2.inserir(new Banana("azul", "plastico"));
 
	  
		 L1.exibir();
		 L2.exibir();
		 System.exit(0);   
	  }   
	

}
