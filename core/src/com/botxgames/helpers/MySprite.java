package com.botxgames.helpers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class MySprite extends Sprite {

    public MySprite(Texture texture) {
        this(texture, false);
    }

    public MySprite(Texture texture, boolean resize) {

        super(texture);

        if (resize) {
            setSize(C.mpp(getWidth()), C.mpp(getHeight()));
        }

    }

    /**
     * Explicit set size. Try not to use often.
     *
     * @param w
     * @param h
     * @param inMeters
     */
    public void setSize(float w, float h, boolean inMeters) {

        if (inMeters) {
            setSize(w, h);
        } else {
            setSize(C.mpp(w), C.mpp(h));
        }


    }

    public void setPosition(Vector2 worldCenter) {
        super.setPosition(worldCenter.x - getWidth() / 2, worldCenter.y - getHeight() / 2);
    }

    public void dispose() {
        getTexture().dispose();
    }
}
