package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost, director, length);
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    @Override
    public void play() throws PlayerException {
        if (this.getLength() <= 0) {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
        for (Track track : tracks) {
            try {
                track.play();
            } catch (PlayerException e) {
                System.err.println(e.getMessage());
                throw e;
            }
        }
    }

    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + ": " + getCost() + "$";
    }
}
