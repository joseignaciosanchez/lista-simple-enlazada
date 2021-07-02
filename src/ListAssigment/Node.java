package ListAssigment;

public class Node {	
	public int valor;
	public Node siguiente; 

	public Node (int val) {
		this.valor = val;
	}
	
	public Node (int val, Node n) {
		valor = val;
		siguiente = n;
	}
}
