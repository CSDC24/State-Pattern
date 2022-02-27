public class Annoyed implements Mood {

    @Override
    public void giveKiss() {
        System.out.println("I'm too annoyed to kiss right now");
    }

    @Override
    public void drinkBeer() {
        System.out.println("Now I feel less annoyed");
    }

    @Override
    public void annoy() {
        System.out.println("I'm still annoyed");
    }

    @Override
    public String toString() {
        return "Annoyed";
    }
}
