public class Neutral implements State {

    @Override
    public void giveKiss(Context context) {

    }

    @Override
    public void drinkBeer(Context context) {
        System.out.println("Boyfriend is drinking");
        context.setState(this);
    }

    @Override
    public void annoy(Context context) {
    }

    @Override
    public String toString() {
        return "Neutral";
    }
}
