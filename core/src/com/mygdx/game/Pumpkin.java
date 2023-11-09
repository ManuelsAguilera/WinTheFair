package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Pumpkin {
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
}
