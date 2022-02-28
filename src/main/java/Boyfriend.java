public class Boyfriend {

    private Mood mood;

    public Boyfriend(Neutral initialMood){
        this.mood = initialMood;
    }

    public void giveKiss(){
        this.mood = this.mood.giveKiss();
    }

    public void annoy(){
        this.mood = this.mood.annoy();
    }

    public void drinkBeer(){
        this.mood = this.mood.drinkBeer();
    }

    public void setCurrentMood(Mood mood) {
        this.mood = mood;
    }

    public Mood getCurrentMood() {
        return mood;
    }

}
