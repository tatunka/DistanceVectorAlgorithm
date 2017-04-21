package graph;

public class ZNode extends Node{
	
	public ZNode(){super();}

	@Override
	protected void initDVs() {
		for(int i=0; i<3; i++)
			for(int j=0; j<2; j++)
				_dv[j][i] = 99999;
		_dv[2][0] = 7;
		_dv[2][1] = 1;
		_dv[2][2] = 0;
	}
}
