public class Stack {
    Nodo top;
    int tamanio;

    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = top;
        top = nuevo;
        tamanio++;
    }

    public int pop() {
        int valor = top.valor;
        top.siguiente = top;
        tamanio--;
        return valor;
    }

    public int peek() {
        return top.valor;
    }

    public int size(){
        return tamanio;
    }

    public boolean isEmpty(){
        if (tamanio == 0){
            return true;
        }
        return false;
    }
}
