package ListaL;

public class Lista{
	 No inicio;  
	 int qtd;
	 
	 public Lista(){
		 inicio = null;
		 qtd = 0;
	 }
	 
	  public void exibir(){
		  if(inicio != null){
	      do{
	        //System.out.println(inicio.getInfo());
	        inicio = inicio.getProximo();
	      }while(inicio != null);
	    }
	    else
	      System.out.println("A lista esta vazia\n\n");
	  }

	  public void inserir(Info x){
	    No no,ant;
	    
	    if(inicio == null){
	      inicio = new No(x);
	      inicio.setInfo(x);
	      inicio.setProximo(null);
	      qtd = qtd + 1;
	    }
	    else{ 
	      no = inicio;
	      while(no != null){
	    	  ant = no;
	    	  no = no.getProximo();
	      }
	      ant = new No(null);
	      ant.setInfo(x);
	      ant.setProximo(null);
	      qtd = qtd + 1;
	    }
	  }
	  
	  public Info buscar(int pos){	
		  Info res;
		  int c = 0;
		  if(inicio != null){
			  while((c != pos) && (inicio != null)){
				  inicio.getProximo();
			  }
		  }
		  res = inicio.getInfo();;
		  return res;
	  }
	  
	  public int procurar(Info x){
		  int pos=0;
		  if(inicio != null){
			  while((inicio.getInfo() != x) && (inicio != null)){
				  inicio.getProximo();
				  pos++;
			  }
		  }
		 return pos;
	  }
	  
	  public int quantidade(Lista l){
		  return qtd;
	  }
}
