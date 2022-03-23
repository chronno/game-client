package com.chronno.client.screens;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class DefaultScreen extends ScreenAdapter {

    private final PooledEngine engine;

    public DefaultScreen(PooledEngine engine) {
        this.engine = engine;
    }


    @Override
    public void show() {
        OrthographicCamera orthographicCamera = new OrthographicCamera(12, 8);
        try {
            Skin skin = new Skin(Gdx.files.internal("/skins/clean-crispy-ui.json"));
            TextButton button1 = new TextButton("Button 1", skin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(float delta) {
        engine.update(delta);
    }

    @Override
    public void dispose() {
        engine.removeAllEntities();
        engine.removeAllSystems();
        engine.clearPools();
    }
}
