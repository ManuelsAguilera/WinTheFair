package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Pumpkin {
    private Sprite sprite;

   
    public Pumpkin() {
    	sprite = new Sprite(new Texture("pumpkin.png"));
        this.shrink(0.92f);
	}

	public float getWidth()
    {
    	return sprite.getWidth();
    }
    public float getHeight()
    {
    	return sprite.getHeight();
    }
    
    public float[] getCenter() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float pumpkinWidth = this.getWidth();
        float pumpkinHeight = this.getHeight();
        float x = (screenWidth - pumpkinWidth) / 2;
        float y = (screenHeight - pumpkinHeight) / 2;
        return new float[] { x, y };
    }


    public void draw(SpriteBatch batch) {
    	sprite.draw(batch);
    }

    public void grow(float scaleAmount) {
        sprite.setScale(sprite.getScaleX() + scaleAmount, sprite.getScaleY() + scaleAmount);
    }

    public void shrink(float scaleAmount) {
        sprite.setScale(sprite.getScaleX() - scaleAmount, sprite.getScaleY() - scaleAmount);
    }
    public void setPos(float x,float y)
    {
    	sprite.setPosition(x, y);
    }
    
    public abstract void create();
    public abstract void update();
    public abstract void growPattern();
    public abstract void shrinkPattern();
}
