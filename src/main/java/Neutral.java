public class Neutral implements Mood {

    @Override
    public Mood giveKiss() {
        System.out.println("Thank you for the kiss!");
        return new Happy();
    }

    @Override
    public Mood drinkBeer() {
        System.out.println("Yes! Beer!");
        return this;
    }

    @Override
    public Mood annoy() {
        System.out.println("Now I'm annoyed and not even drunk.");
        return new Annoyed();
    }
}
