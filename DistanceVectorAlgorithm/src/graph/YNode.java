package graph;

public class YNode extends Node{

	public YNode(){
		super();
		_index = 1;
		for(int i=0; i<3; i++)
			_dv[0][i] = 99999;
		_dv[1][0] = 2;
		_dv[1][1] = 0;
		_dv[1][2] = 1;
		for(int i=0; i<3; i++)
			_dv[2][i] = 99999;
	}
}
