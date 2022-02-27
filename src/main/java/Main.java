public class Main {

    public static void main(String[] args) {
        var boyfriend = new Boyfriend();

        boyfriend.setCurrentMood(new Neutral());
        boyfriend.giveKiss();
        boyfriend.drinkBeer();

        boyfriend.setCurrentMood(new Annoyed());
        boyfriend.giveKiss();
        boyfriend.drinkBeer();

        boyfriend.setCurrentMood(new Happy());
        boyfriend.giveKiss();
        boyfriend.drinkBeer();
    }

}
