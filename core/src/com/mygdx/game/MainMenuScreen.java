package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.StretchViewport;


public class MainMenuScreen implements Screen {
    private final Game game;
    private Stage stage;
    private Skin skin;
    
    public MainMenuScreen(final Game game) {
    	this.game = game;
    	
    	// Crea un Stage para la interfaz de usuario
        stage = new Stage(new StretchViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()));
        Gdx.input.setInputProcessor(stage);
        
        // Crea un Skin para los elementos de la interfaz de usuario
        skin = new Skin(Gdx.files.internal("data/uiskin.json"));
        
        // Crea un botón de inicio
        TextButton startButton = new TextButton("Iniciar", skin);
        startButton.setPosition(100, 200);
        
        // Agrega un listener al botón para manejar la acción de inicio
        startButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                // Aquí puedes realizar alguna acción al hacer clic en el botón
                // Por ejemplo, cambiar a otra pantalla
            	game.setScreen(new GrowPumpkinGame());
            }
        });
        
        // Agrega el botón al Stage
        stage.addActor(startButton);
    }

    @Override
    public void show() {
        // No es necesario implementar nada aquí para esta pantalla
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(20, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        // Dibuja el Stage
        stage.act(delta);
        stage.draw();
    }
    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {
        // No es necesario implementar nada aquí para esta pantalla
    }

    @Override
    public void resume() {
        // No es necesario implementar nada aquí para esta pantalla
    }

    @Override
    public void hide() {
        // Liberar recursos de esta pantalla, si es necesario
    }

    @Override
    public void dispose() {

    }
}
