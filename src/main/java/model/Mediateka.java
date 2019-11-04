package model;

import model.file.AudioFile;
import model.file.BaseFile;
import model.file.VideoFile;
import model.player.AudioPlayer;
import model.player.Player;
import model.player.VideoPlayer;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;

/**
 * 04.11.2019
 * model
 *
 * @author Talochka Pavel
 */
public class Mediateka {
    List<BaseFile> playlist;
    Player player;

    public Mediateka(List<BaseFile> playlist) {
        this.playlist = playlist;
    }

    void Start() {
        for (int i = 0; i<playlist.size(); i++){
            if (playlist.get(i) instanceof AudioFile){
                player=new AudioPlayer();

            }
            if (playlist.get(i) instanceof VideoFile)
                player=new VideoPlayer();
            player.play(playlist.get(i));
        }

    }

    public static void main(String[] args) {
        List<BaseFile> curentList = new ArrayList<BaseFile>();
        curentList.add(new AudioFile());
        curentList.add(new VideoFile());
        curentList.add(new AudioFile());
        Mediateka mediateka = new Mediateka(curentList);
        mediateka.Start();


    }
}
