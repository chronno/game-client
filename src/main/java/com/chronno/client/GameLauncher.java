package com.chronno.client;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.esotericsoftware.minlog.Log;

public class GameLauncher {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setIdleFPS(60);
        config.setTitle("Survival");
        config.setWindowedMode(960, 640);
        try {
            new Lwjgl3Application(new GameEngine(), config);
        } finally {
            Log.info("Game is shutting down");
        }
    }
}
