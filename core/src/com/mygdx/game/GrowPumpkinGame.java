package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GrowPumpkinGame implements Screen {
    private Pumpkin pumpkin;
    private SpriteBatch batch;
    private GameManager manager;
    
    public GrowPumpkinGame()
    {
        //start Batch
      	batch = new SpriteBatch();
      	
      	manager = new GameManager();
      	

    }
    
    
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 1, 0, 1); // Green color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        


        batch.begin();
        
        manager.render(batch);
        
        batch.end();
    }

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
