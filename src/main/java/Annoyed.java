public class Annoyed implements State {

    @Override
    public void giveKiss(Context context) {
    }

    @Override
    public void drinkBeer(Context context) {

    }

    @Override
    public void annoy(Context context) {
        System.out.println("Boyfriend is annoyed");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Annoyed";
    }
}
