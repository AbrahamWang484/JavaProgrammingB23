package day40_CustomClass_Statics;

import javax.crypto.interfaces.PBEKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Movie {
    public String country, title, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts;

    public void setInfo(String country, String title, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast(String cast) {
        casts.add(cast);
    }

    public void addCast(String[] castArr) {
        Collections.addAll(casts, castArr);
    }

    public void addCast(ArrayList<String> castsAdditional) {
        for (String cast : castsAdditional) {
            casts.add(cast);
        }
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", total of casts=" + casts.size() +
                '}';
    }
}
/*
2. Create a class named Movie
    Attributes:
        country (String), title (String), releaseDate (LocalDate), director (String), casts (ArrayList<String>)

    Instance methods
        setInfo(): sets the country, title, release date, and director of the Movie
        addCast(String): adds the given string argument to the arrayList casts
        addCast(String[]): adds the given string array argument to the arrayList casts
        addCast(ArrayLis<String>): adds the given string arraylist argument to the arrayList casts
        toString(): returns the name of country, title, release date, and total number of casts
 */