import java.util.List;

class Artist {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Song {
    private String title;
    private List<Artist> artists;

    public Song(String title) {
        this.title = title;
        this.artists = new java.util.ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public String getTitle() {
        return title;
    }
}

class Album {
    private String title;
    private List<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new java.util.ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getTitle() {
        return title;
    }
}

public class AggregationWithArrayList {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Nusrat Fateh Ali Khan");
        Artist artist2 = new Artist("Abida Parveen");

        Song song1 = new Song("Tumhein Dillagi Bhool Jani Padegi");
        song1.addArtist(artist1);
        Song song2 = new Song("Tere Ishq Nachaya");
        song2.addArtist(artist1);
        song2.addArtist(artist2);

        Album album1 = new Album("Sufi Qawwalis");
        album1.addSong(song1);

        Album album2 = new Album("Sufi Mystical Songs");
        album2.addSong(song2);

        displayAlbumDetails(album1);
        displayAlbumDetails(album2);
    }

    public static void displayAlbumDetails(Album album) {
        System.out.println("Album Details:");
        System.out.println("  Title: " + album.getTitle());
        System.out.println("  Songs:");
        List<Song> songsInAlbum = album.getSongs();
        for (Song song : songsInAlbum) {
            System.out.println("    - " + song.getTitle());
            System.out.println("    Artists:");
            List<Artist> artistsOfSong = song.getArtists();
            for (Artist artist : artistsOfSong) {
                System.out.println("      - " + artist.getName());
            }
        }
    }
}
