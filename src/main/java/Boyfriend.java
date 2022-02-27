public class Boyfriend {

    private Mood mood;

    public void drinkBeer(){
        mood.drinkBeer();
    }
    public void giveKiss(){
        mood.giveKiss();
    }
    public void annoy(){
        mood.annoy();
    }

    public void setCurrentMood(Mood mood) {
        this.mood = mood;
    }

    public Mood getCurrentMood() {
        return mood;
    }

}
