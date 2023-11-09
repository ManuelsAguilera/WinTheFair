package com.mygdx.game;

public class OwnPumpkin extends Pumpkin {
	
	public OwnPumpkin()
	{
		this.create();
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void growPattern() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shrinkPattern() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		float[] center = super.getCenter();
		center[0] -= 200;
		center[1] += 200;
		super.setPos(center[0], center[1]);
	}

}
