public class ListaEncadeada {
    private Nodo lista;
    private int totalElementos;
    
    public ListaEncadeada() { // criação da lista
        this.lista = null; // lista vazia!
        this.totalElementos = 0;
    }
    
    public void insereInicio(Nodo novoNodo) {
        
        if (this.lista != null) { // lista possui elementos
            novoNodo.setProximo(this.lista);
            this.lista = novoNodo;
        } else { // está vazia
            this.lista = novoNodo;
        }
        totalElementos++;
    }
    
    public void removeInicio() {
        
        if (this.lista == null) { // lista não possui elementos
            System.out.println("Lista Vazia!");
        } else { // seta o proximo valor como primeiro valor
            this.lista = this.lista.getProximo();
        }
        totalElementos--;
    }
    
    public void insereFim(Nodo novoNodo){
        
        if (this.lista == null) {
            this.lista = novoNodo;
        }else{
            Nodo aux = this.lista;
               while(aux.getProximo() != null){
                   aux = aux.getProximo();
               }
               aux.setProximo( novoNodo );
        }
        totalElementos++;
    }
    
    public void removeFim(){
        
        if (this.lista == null) {
            System.out.println("Lista Vazia!");
        }
        else{
            
            Nodo aux = this.lista;
            Nodo anterior = this.lista;
            
            while (aux.getProximo() != null){
                anterior = aux;
                aux = aux.getProximo();
            }
            anterior.setProximo(null);
        }
        totalElementos--;
    }

    @Override
    public String toString() { // mostra lista
        return "Lista Encadeada: " + lista +
               "\nTotal de Elementos: " + totalElementos;
    } 
}