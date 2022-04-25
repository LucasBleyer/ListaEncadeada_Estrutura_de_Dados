public class ListaEncadeada {
    private Nodo lista;
    private int totalElementos;
    
    public ListaEncadeada() {
        this.lista = null;
        this.totalElementos = 0;
    }
    
    public void insereInicio(Nodo novoNodo) {
        
        if (this.lista != null)
        {
            novoNodo.setProximo(this.lista);
            this.lista = novoNodo;
        } 
        else 
        {
            this.lista = novoNodo;
        }
        this.totalElementos++;
      
    }
    
    public void insereMeio(Nodo novoNodo) {
        
        if ( this.lista == null )
        {
            insereInicio(novoNodo);
        } 
        else 
        {
            if ( this.totalElementos >= 2 ) 
            {
                int meio = this.totalElementos / 2;
                Nodo aux = this.lista;
                for (int i = 1; i < meio; i++)
                {
                    aux = aux.getProximo();
                }
                novoNodo.setProximo( aux.getProximo() );
                aux.setProximo( novoNodo );
                this.totalElementos++;
            } 
            else 
            {
                insereFinal(novoNodo);
            }
        }
    }
    
    public void insereFinal(Nodo novoNodo) {
        
        if (this.lista == null) 
        {
            this.lista = novoNodo;
        } 
        else 
        {
            Nodo aux = this.lista;
            while (aux.getProximo() != null) 
            {
                aux = aux.getProximo();
            }
            aux.setProximo( novoNodo );
        }
        this.totalElementos++;
    }
    
    public void removeInicio() {
        
        if (this.lista == null) 
        {
            System.out.println("Lista Vazia!");
        }
        else 
        {
            this.lista = this.lista.getProximo();
            this.totalElementos--;
        }
        
    }
    
    public void removeMeio() {
        if ( this.lista == null )
        {
            System.out.println("Lista Vazia");;
        } 
        else 
        {
            if ( this.totalElementos >= 2 ) 
            {
                int meio = this.totalElementos / 2;
                Nodo anterior = this.lista;
                for (int i = 1; i < meio; i++)
                {
                    lista.setProximo(anterior);
                }
                this.totalElementos--;
            } 
            else 
            {
                removeFinal();
            }
        }
    }
    
    public void removeFinal() {
        
        if (this.lista == null) 
        {
           System.out.println("Lista Vazia!");
        } 
        else 
        {
            if (this.totalElementos == 1) 
            {
                this.lista = null;
            } 
            else {
                
                Nodo aux = this.lista;
                Nodo anterior = this.lista;
                while (aux.getProximo() != null)
                {
                    anterior = aux;
                    aux = aux.getProximo();
                }
                anterior.setProximo( null );
                
            }
            this.totalElementos--;
        }
    }
    
    public Nodo acesso(int posicao) {
        
        Nodo nodoRetornado = null;
        
        if (this.lista == null) 
        {
            System.out.println("Lista Vazia!");
        } 
        else 
        {
            if (posicao <= this.totalElementos) 
            {
                Nodo aux = this.lista;
                for (int i = 1; i < posicao; i++) 
                {
                    aux = aux.getProximo();
                }
                nodoRetornado = aux;
                nodoRetornado.setProximo( null );
            }
        }
        return nodoRetornado;
    }

    @Override
    public String toString() {
        return "Lista Encadeada: " + lista + 
               "\nQuantidade de Elementos: " + totalElementos;
    }
}
