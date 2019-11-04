package model.player;

import model.file.BaseFile;

/**
 * 04.11.2019
 * model.player
 *
 * @author Talochka Pavel
 */
public abstract class Player {
    String name;
    String fileName;
    public abstract void play(BaseFile file);
}
