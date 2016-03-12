package ListaL;

public class ListaBananas extends Lista{
	No inicio;
	public void inserir(Banana b1){
	    No no,ant;
	    
	    if(inicio == null){
	      inicio = new No(b1);
	      inicio.setInfo(b1);
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
	      ant.setInfo(b1);
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
	  
	  public int procurar(Banana b1){
		  int pos=0;
		  if(inicio != null){
			  while((inicio.getInfo() != b1) && (inicio != null)){
				  inicio.getProximo();
				  pos++;
			  }
		  }
		 return pos;
	  }

}
