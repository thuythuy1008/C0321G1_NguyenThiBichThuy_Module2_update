package models;

public class CinemaTicket {
    private int id;
    private String movieName;

    public CinemaTicket() {
    }

    public CinemaTicket(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "id =" + id +
                ", movieName ='" + movieName;
    }
}
