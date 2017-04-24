package shortestpath;

import graph.Graph;
import graph.Node;

public class ASP {

	public static int[] update(Graph g, Node s, Node t){
	// n= number of nodes in G
		int count = 0;
	//Array M[V]
		int M[] = new int[3];
	//Initialize M[t] = 0 and M[v] = inf for all other v in V
		for(int i=0; i<3; i++)
			M[i] = 9999;
		M[t.index()] = 0;
	//Declare t to be active and all other nodes inactive
		for(int i=0; i<3; i++)
			g.get(i).inactive();
		t.active();
	//While there exists an active node
		Node w = null;
		while(g.hasActive()){
			count++;
	//choose an active node w
			for(int i=0; i<g.size(); i++){
				if(g.get(i).isActive()){
					w = g.get(i);
					break;
				}
			}
	//for all edges (v, w) in any order
			Node[] wconnect = w.getConnections();
			for(int i=0; i<wconnect.length; i++){
				Node v = wconnect[i];
				int oVal = M[wconnect[i].index()];
				int cVW = g.getCost(v, w);
	//M[v] = min(M[v], cVW + M[w])
				M[v.index()] = Math.min(M[v.index()], cVW + M[w.index()]);
	//if this changes the value of M[v], then
				if(M[v.index()] != oVal){
	//first[v] = w
					v.setFirst(w);
					v.active();
				}
			}
	//w becomes inactive
			w.inactive();
		}
		System.out.println("count: " + count);
		return M;
	}
	
}
