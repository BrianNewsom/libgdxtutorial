package com.brian.mygdxgame2;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "my-gdx-game2";
		cfg.useGL20 = false;
		cfg.width = 800;
		cfg.height = 400;
		
		new LwjglApplication(new MyGdxGame2(), cfg);
	}
}
