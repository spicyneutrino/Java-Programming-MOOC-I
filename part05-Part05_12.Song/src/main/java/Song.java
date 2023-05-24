
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public Boolean equals(Song compared) {
        // location same : equal
        if (this == compared) {
            return true;
        }
        // if compared object is not a Song type object: not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // type cast passed object into a Song type object
        Song comparedSong = (Song) compared;

         // if the values of the both the object are same, the objects are equal
        if (this.artist.equals(comparedSong.artist )&&
            this.name.equals(comparedSong.name ) &&
            this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        return false;

    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getDurationInSeconds() {
        return this.durationInSeconds;
    }

//    @Override
//    public String toString() {
//        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
//    }
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}
