package com.botxgames.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.botxgames.GameClass;

public abstract class MyScreen implements Screen {

    public final SpriteBatch batch;

    protected final GameClass gameclass;
    protected final AssetManager am;


    MyScreen(final GameClass gameclass) {
        this.gameclass = gameclass;
        this.batch = gameclass.batch;
        am = gameclass.am;
    }

    // override common methods


    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

}
