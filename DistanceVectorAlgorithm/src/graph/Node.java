package graph;

public abstract class Node {
	Node[] _connections;
	int[][] _dv;
	boolean _active;
	
	public Node(){
		_active = false;
		_dv = new int[3][3];
		initDVs();
	}	
	protected abstract void initDVs();
}
