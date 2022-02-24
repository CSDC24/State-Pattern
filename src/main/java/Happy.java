public class Happy implements State{

    @Override
    public void giveKiss(Context context) {
        System.out.println("You are kissing your Boyfriend");
        context.setState(this);
    }

    @Override
    public void drinkBeer(Context context) {

    }

    @Override
    public void annoy(Context context) {

    }

    @Override
    public String toString() {
        return "Happy";
    }
}
