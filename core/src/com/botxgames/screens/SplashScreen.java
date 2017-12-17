package com.botxgames.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.botxgames.GameClass;
import com.botxgames.helpers.C;
import com.botxgames.helpers.MySprite;

public class SplashScreen extends MyScreen {

    final MySprite sprite;

    public SplashScreen(GameClass gameclass) {
        super(gameclass);

        final float w = Gdx.graphics.getWidth();
        final float h = Gdx.graphics.getHeight();

        am.load(C.Assets.SPLASH_IMG, Texture.class);
        am.finishLoading();

        sprite = new MySprite(am.get(C.Assets.SPLASH_IMG, Texture.class));

        sprite.setScale(5f);
        final float sx = (w / 2f) - (sprite.getWidth() / 2f);
        final float sy = (h / 2f) - (sprite.getHeight() / 2f);
        sprite.setPosition(sx, sy);

    }

    @Override
    public void render(float delta) {

        batch.begin();
        sprite.draw(batch);
        batch.end();

        if (am.update()) {

        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void dispose() {
        sprite.dispose();
    }
}
