public class PlayerCharacter {

    private int intuition;

    public void senseEmotion(NPC npc){
        Emotion e = npc.tryGetEmotion(intuition);
        if(e != null){

         switch(e){ //a clearer syntax that reduces the else if statements
                case HAPPY:
                    System.out.println("Hey, I see you are happy, give me stuff");
                    break;
                case SAD:
                    System.out.println("See you are sad, Would you like some Tayto?");
                case ANGRY:
                case LONELY:
                case CURIOUS:
                case PENSIVE:
                    System.out.println("I see you are" + e);
                    break;
            } else{
                System.out.println("You are hard to read");
            }
        }
    }


}
