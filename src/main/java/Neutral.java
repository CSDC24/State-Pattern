public class Neutral implements Mood {

    @Override
    public void giveKiss() {
        System.out.println("Thank you for the kiss!");
    }

    @Override
    public void drinkBeer() {
        System.out.println("Yes! Beer!");
    }

    @Override
    public void annoy() {
        System.out.println("Now I'm drunk and annoyed.");
    }

    @Override
    public String toString() {
        return "Neutral";
    }
}
