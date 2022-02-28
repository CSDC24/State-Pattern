public class Annoyed implements Mood {

    @Override
    public Mood giveKiss() {
        System.out.println("I'm too annoyed to kiss right now");
        return this;
    }

    @Override
    public Mood drinkBeer() {
        System.out.println("Now I feel less annoyed");
        return new Neutral();
    }

    @Override
    public Mood annoy() {
        System.out.println("I'm still annoyed");
        return this;
    }
}
