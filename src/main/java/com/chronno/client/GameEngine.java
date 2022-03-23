package com.chronno.client;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.Game;
import com.chronno.client.screens.DefaultScreen;

public class GameEngine extends Game {

    private final PooledEngine engine;

    public GameEngine() {
        this.engine = new PooledEngine();
    }

    @Override
    public void create() {
        setScreen(new DefaultScreen(engine));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }
}
