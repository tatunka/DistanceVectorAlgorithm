package graph;

public abstract class Node {
	Node[] _connections;
	int[][] _dv;
	boolean _active;
	Node _first;
	int _index;
	
	public Node(){
		_active = false;
		_dv = new int[3][3];
		_connections = new Node[2];
	}	
	
	protected void addConnections(Node a, Node b){
		_connections[0] = a;
		_connections[1] = b;
	}
	
	public int index(){ return _index;}
	public boolean isActive(){return _active;}
	public Node[] getConnections(){return _connections;}
	public void active() {_active = true;}
	public void inactive(){_active = false;}
	public void setFirst(Node first){ _first = first;}
	
}
