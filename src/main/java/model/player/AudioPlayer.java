package model.player;

import model.file.BaseFile;

/**
 * 04.11.2019
 * model.player
 *
 * @author Talochka Pavel
 */
public class AudioPlayer extends Player {
    public AudioPlayer() {
    }

    @Override

    public void play(BaseFile file) {
        System.out.println(file.getStrream());
    }
}
