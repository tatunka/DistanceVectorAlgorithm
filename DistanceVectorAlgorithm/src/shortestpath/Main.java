package shortestpath;

import graph.Graph;
import graph.Node;

public class Main {
	public static void main(String[] args){
		Graph g = new Graph();
		Node x = g.get(0);
		Node y = g.get(1);
		Node z = g.get(2);
		
		
		int[] l = ASP.update(g, x, x);
		for(int i : l)
			System.out.print(i + " ");
		System.out.println("");
		int[] m = ASP.update(g, x, y);
		for(int i : m)
			System.out.print(i + " ");
		System.out.println("");
		int[] n = ASP.update(g, x, z);
		for(int i : n)
			System.out.print(i + " ");
		System.out.println("\n");
		
		g.changeCost(x, y, 4);
		g.changeCost(y, x, 4);
		
		l = ASP.update(g, x, x);
		for(int i : l)
			System.out.print(i + " ");
		System.out.println("");
		m = ASP.update(g, x, y);
		for(int i : m)
			System.out.print(i + " ");
		System.out.println("");
		n = ASP.update(g, x, z);
		for(int i : n)
			System.out.print(i + " ");
		System.out.println("\n");
		
		g.changeCost(x, y, 60);
		g.changeCost(y, x, 60);
		
		l = ASP.update(g, x, x);
		for(int i : l)
			System.out.print(i + " ");
		System.out.println("");
		m = ASP.update(g, x, y);
		for(int i : m)
			System.out.print(i + " ");
		System.out.println("");
		n = ASP.update(g, x, z);
		for(int i : n)
			System.out.print(i + " ");
		System.out.println("");
		
		
	}
}
