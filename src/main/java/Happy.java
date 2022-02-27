public class Happy implements Mood {

    @Override
    public void giveKiss() {
        System.out.println("Thank you! <3");
    }

    @Override
    public void drinkBeer() {
        System.out.println("That's refreshing");
    }

    @Override
    public void annoy() {
        System.out.println("You ruined the mood");
    }

    @Override
    public String toString() {
        return "Happy";
    }
}
