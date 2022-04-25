public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada lista = new ListaEncadeada();
        
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        lista.insereInicio( novoNodo );
        
        novoNodo = new Nodo();
        novoNodo.setValor(5);
        lista.insereInicio( novoNodo );
        
        novoNodo = new Nodo();
        novoNodo.setValor(20);
        lista.insereFinal( novoNodo );
        
        lista.removeMeio();
        
        System.out.println(lista.toString());
        
    }
}
