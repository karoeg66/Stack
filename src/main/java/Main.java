public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.printStack();
        System.out.println("-----------------------");
        stack1.pop();
        stack1.printStack();
        System.out.println("----------------------");
        System.out.println("Elemento en el top: " +  stack1.peek() );
        System.out.println("Tamaño de la pila: " + stack1.size());
        System.out.println("La pila esta vacia? : " + stack1.isEmpty());
    }
}
