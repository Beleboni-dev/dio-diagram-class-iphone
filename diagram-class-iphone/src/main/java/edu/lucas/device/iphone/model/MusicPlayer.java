package main.java.edu.lucas.device.iphone.model;

import main.java.edu.lucas.device.iphone.interfaces.MusicPlayers;

public abstract class MusicPlayer implements MusicPlayers {
    @Override
    public void play() {
        System.out.println("Tocando a musica...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a musica...");
    }
}
