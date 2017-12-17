package com.botxgames;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;
import com.botxgames.screens.SplashScreen;

public class GameClass extends Game {

	public SpriteBatch batch;
	public AssetManager am;


	@Override
	public void create () {
		batch = new SpriteBatch();

		am = new AssetManager();
		FileHandleResolver resolver = new InternalFileHandleResolver();
		am.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
		am.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));
		am.setLoader(BitmapFont.class, ".dfont", new FreetypeFontLoader(resolver));

		setScreen(new SplashScreen(this));

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		final float delta = Gdx.graphics.getDeltaTime();

		getScreen().render(delta);

	}
	
	@Override
	public void dispose () {
		super.dispose();
		batch.dispose();
		am.dispose();
	}
}
