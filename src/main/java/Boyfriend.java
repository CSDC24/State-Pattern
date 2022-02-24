public class Boyfriend {

    public static void main(String[] args) {
        Context context = new Context();

        Neutral neutral = new Neutral();
        neutral.drinkBeer(context);
        printState(context);

        Happy happy = new Happy();
        happy.giveKiss(context);
        printState(context);

        Annoyed annoyed = new Annoyed();
        annoyed.annoy(context);
        printState(context);

    }

    private static void printState(Context context) {
        System.out.println("The state changed to: " + context.getState().toString());
    }

}
