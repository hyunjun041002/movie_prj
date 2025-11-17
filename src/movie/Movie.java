package movie;

public class Movie {
    private String title;
    private int seatCount;

    public Movie(String title, int seatCount) {
        this.title = title;
        this.seatCount = seatCount;
    }

    public String getTitle() {
        return title;
    }

    public boolean reserveSeat(int count) {
        if (seatCount >= count) {
            seatCount -= count;
            return true;
        }
        return false;
    }

    public int getRemainingSeats() {
        return seatCount;
    }
}