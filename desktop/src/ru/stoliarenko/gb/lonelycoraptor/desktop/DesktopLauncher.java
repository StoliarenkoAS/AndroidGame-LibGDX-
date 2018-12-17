package ru.stoliarenko.gb.lonelycoraptor.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ru.stoliarenko.gb.lonelycoraptor.SpaceSurvivor;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 720;
		config.height = 405;
		config.resizable = false;
		new LwjglApplication(new SpaceSurvivor(), config);
	}
}
