package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameManager   {
	private Pumpkin pumpkin;
	public GameManager() {
		pumpkin = new Pumpkin();
      	//Create objects
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        
        // Calcula las coordenadas para centrar la calabaza
        float pumpkinWidth = pumpkin.getWidth();
        float pumpkinHeight = pumpkin.getHeight();
        float x = (screenWidth - pumpkinWidth) / 2;
        float y = (screenHeight - pumpkinHeight) / 2;
        
        pumpkin.setPos(x,y);
    }

    public void render(SpriteBatch batch) {
        pumpkin.draw(batch);
    }
}
