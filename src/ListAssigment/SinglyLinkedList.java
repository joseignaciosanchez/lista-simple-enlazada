package ListAssigment;

public class SinglyLinkedList {
	
	public Node inicio; 

	public SinglyLinkedList() {
		inicio = null;
	}
	
	public void add(int elemento) {
		Node nuevoNodo = new Node(elemento);
		if (inicio == null) {
			inicio = nuevoNodo;
		}
		else {
			Node recorrer = inicio;
            while(recorrer.siguiente != null) {            	
            	recorrer = recorrer.siguiente;            	
            }
            recorrer.siguiente = nuevoNodo;   
        }		
	}
	
	public void remove() {
		Node recorrer;
		recorrer = inicio;
		if (inicio == null) {
			return;
		}
		if (inicio.siguiente == null) {
			inicio = null;
			return;
		}
		
		while(recorrer != null) {
			if (recorrer.siguiente.siguiente == null) {			
				break;
			}			
			recorrer = recorrer.siguiente;			
		}
		recorrer.siguiente = null;
		//System.out.println(recorrer.siguiente.siguiente);	
	}
	
	public void removeAt(int elemento) {
		
		Node recorrer, temporal;
		recorrer = inicio;
		temporal = inicio.siguiente;
		while(temporal.siguiente != null && temporal.valor != elemento) {            	
			recorrer = recorrer.siguiente;            	
			temporal = temporal.siguiente;
			}
		recorrer.siguiente = temporal.siguiente;  
	}
	
	public void printValues() {
		Node recorrer = inicio;
        while(recorrer != null) {    
        	System.out.print("["+recorrer.valor+"]");
        	recorrer = recorrer.siguiente;         	
        }		
        
	}
	
}
