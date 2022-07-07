public class NPC {

    private Emotion emotion;

    public NPC(Emotion emotion) {
        this.emotion = emotion;
    }

    public Emotion tryGetEmotion(int intuition){
        if(intuition >= 100) return this.emotion;
        else if (Math.floor(Math.random()* 100) <= intuition){ //Math.floor rounds to the nearest whole number
            return emotion; //Math.random generates a random double between 100 and 1
        }
        return null;
    }

}
