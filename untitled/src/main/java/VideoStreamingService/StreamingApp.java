package VideoStreamingService;

public class StreamingApp {
    public static void main(String[] args) {
        Video movie = new Movie ("The Matrix", 148, 9.2);
        Video series = new TvSeries("The last of us", 42, 12 );

        System.out.println(movie.getInfo());
        System.out.println(series.getInfo());
    }
}
