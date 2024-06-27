public class Episode {
    private int EpisodeNumber;
    private String EpisodeName;

    public Episode(int episodeNumber,String name) {
        EpisodeNumber = episodeNumber;
        EpisodeName = name;
    }

    public int shownumber()
    {
        return EpisodeNumber;
    }
    public String showname()
    {
        return EpisodeName;
    }
}
