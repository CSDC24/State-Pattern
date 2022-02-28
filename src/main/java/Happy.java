public class Happy implements Mood {

    @Override
    public Mood giveKiss() {
        System.out.println("Thank you! <3");
        return this;
    }

    @Override
    public Mood drinkBeer() {
        System.out.println("That's refreshing");
        return new Neutral();
    }

    @Override
    public Mood annoy() {
        System.out.println("You ruined the mood");
        return new Annoyed();
    }

}
