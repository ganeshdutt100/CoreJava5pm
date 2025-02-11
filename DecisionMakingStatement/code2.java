package DecisionMakingStatement;

public class code2 {
    public static void main(String[] args) {
        int dataRecharge = 200;
        int premiumYoutube = 400;

        if(dataRecharge >= 250){
            System.out.println("dataRecharged ");

            if(premiumYoutube >= 350){
                System.out.println("You can watch premium YouTube videos");
            }
            else{
                System.out.println("You don't have enough premium YouTube videos");
            }
        }
        else{
            System.out.println("you don't have enough data");
        }
    }
}
