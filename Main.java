public class Main {
    public static void main(String[] args) {
        
    //criação do objeto lista    
        ListaEncadeada lista = new ListaEncadeada();
        
    //criação dos objetos da lista    
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        lista.insereInicio( novoNodo );
        
        novoNodo = new Nodo();
        novoNodo.setValor(5);
        lista.insereInicio( novoNodo );  
        
        novoNodo = new Nodo();
        novoNodo.setValor(20);
        lista.insereFim( novoNodo );
        
    //teste
        lista.removeFim();
    
    //saida de dados    
        System.out.println(lista.toString());
    }
}