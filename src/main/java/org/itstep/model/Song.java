package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private int id;

    @Column(name = "song_name")
    private String songName;
    @Column(name = "song_year")
    private int songYear;
    @Column(name = "audio_file_path")
    private String audioFilePath;
    public int getId() {
        return id;
    }

    public String getAudioFilePath() {
        return audioFilePath;
    }

    public void setAudioFilePath(String audioFilePath) {
        this.audioFilePath = audioFilePath;
    }

    public void setId(int id) {
        
this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getSongYear() {
        return songYear;
    }

    public void setSongYear(int songYear) {
        this.songYear = songYear;
    }

    public Song() {
    }

    public Song(int id, String songName, int songYear) {
        
this.id = id;
        this.songName = songName;
        this.songYear = songYear;
    }
} 