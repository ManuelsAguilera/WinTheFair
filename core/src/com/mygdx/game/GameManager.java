package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameManager {
    private OwnPumpkin pumpkin;
    private float x, y; // Coordinates to center the pumpkin

    public GameManager() {
        pumpkin = new OwnPumpkin();
        
        // Move the code for centering the pumpkin to the render method
        // This ensures that dimensions are set correctly before centering
    }
    
  

    public void render(SpriteBatch batch) {
        
    	
        
        pumpkin.draw(batch);
        
      }
}
