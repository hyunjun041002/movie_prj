package movie;

public class MovieList {
    private Movie[] movies;

    public MovieList() {
        movies = new Movie[] {
                new Movie("해리포터", 10),
                new Movie("아바타", 5),
                new Movie("어벤져스", 8)
        };
    }

    public void showAll() {
        System.out.println("🎥 현재 상영 중인 영화:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i].getTitle() + " (좌석: " + movies[i].getRemainingSeats() + ")");
        }
    }

    public Movie getMovie(int index) {
        return movies[index];
    }
}