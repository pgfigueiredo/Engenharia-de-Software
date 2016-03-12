package ListaL;

public class TesteLista{
	  public static void main(String args[]){
	    // vamos criar uma nova lista
	    Lista lista = new Lista();
	    Info info = new Info();
	    
	    // vamos inserir quatro valores na lista
	    lista.inserir(45);
	    lista.inserir(3);
	    lista.inserir(98);
	    lista.inserir(17);

	    // exibe os valores na lista
	    lista.exibir();

	    System.exit(0);   
	  }  
	}
