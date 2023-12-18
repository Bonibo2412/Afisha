import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void addManyMovies() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Film Comedy");

        String[] expected = {"Film Comedy"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNoMovie() {
        FilmManager manager = new FilmManager();

        manager.findAll();

        int expected = 0;
        int actual = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findLastInLimit() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastOverLimit() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");

        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastUnderLimit() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");


        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
