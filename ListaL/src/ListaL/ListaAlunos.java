package ListaL;

public class ListaAlunos extends Lista{
	No inicio;
	public void inserir(Aluno al){
	    No no,ant;
	    
	    if(inicio == null){
	      inicio = new No(al);
	      inicio.setInfo(al);
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
	      ant.setInfo(al);
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
	  
	  public int procurar(Aluno al){
		  int pos=0;
		  if(inicio != null){
			  while((inicio.getInfo() != al) && (inicio != null)){
				  inicio.getProximo();
				  pos++;
			  }
		  }
		 return pos;
	  }
}
