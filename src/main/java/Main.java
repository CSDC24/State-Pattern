public class Main {

    public static void main(String[] args) {
        var boyfriend = new Boyfriend();

        boyfriend.setCurrentMood(new Neutral());
        System.out.println("NEUTRAL");
        boyfriend.giveKiss();
        boyfriend.drinkBeer();
        boyfriend.annoy();

        System.out.println();

        boyfriend.setCurrentMood(new Annoyed());
        System.out.println("ANNOYED");
        boyfriend.giveKiss();
        boyfriend.drinkBeer();
        boyfriend.annoy();

        System.out.println();

        boyfriend.setCurrentMood(new Happy());
        System.out.println("HAPPY");
        boyfriend.giveKiss();
        boyfriend.drinkBeer();
        boyfriend.annoy();
    }

}
