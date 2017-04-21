package graph;

public class Graph {
	
	static int[][] COSTS;
	static Node[] GRAPH;
	
	public Graph(){
		COSTS = new int[3][3];						//x = 0, y = 1, z = 2
		GRAPH = new Node[3];
		
		COSTS[0][0] = 0;							//c(x,x) = 0
		COSTS[0][1] = 2;							//c(x,y) = 2
		COSTS[0][2] = 7;							//c(x,z) = 7
		COSTS[1][0] = 2;							//c(y,x) = 2
		COSTS[1][1] = 0;							//c(y,y) = 0
		COSTS[1][2] = 1;							//c(y,z) = 1
		COSTS[2][0] = 7;							//c(z,x) = 7
		COSTS[2][1] = 1;							//c(z,y) = 1
		COSTS[2][2] = 0;							//c(z,z) = 0
	}
}
