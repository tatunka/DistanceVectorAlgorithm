package graph;

public class XNode extends Node{

	public XNode(){
		super();
		_index = 0;
		_dv[0][0] = 0;
		_dv[0][1] = 2;
		_dv[0][2] = 7;
		for(int i=0; i<3; i++)
			for(int j=1; j<3; j++)
				_dv[j][i] = 999999999;
	}
}
