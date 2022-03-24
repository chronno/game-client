package com.chronno.client.screens;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;

public class DefaultScreen extends ScreenAdapter {

    private final PooledEngine engine;

    public DefaultScreen(PooledEngine engine) {
        this.engine = engine;
    }

    private Stage stage;


    @Override
    public void show() {
        OrthographicCamera orthographicCamera = new OrthographicCamera(12, 8);
        try {
            Skin skin = new Skin(Gdx.files.internal("skins/neon-ui.json"));
            stage = new Stage();
            Gdx.input.setInputProcessor(stage);
            Label nameLabel = new Label("Name:", skin);
            nameLabel.setY(620);
            TextField nameInput = new TextField("", skin);
            nameInput.setX(80);
            nameInput.setY(615);
            stage.addActor(nameLabel);
            stage.addActor(nameInput);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(float delta) {

        engine.update(delta);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void dispose() {
        engine.removeAllEntities();
        engine.removeAllSystems();
        engine.clearPools();
        stage.dispose();
    }
}
