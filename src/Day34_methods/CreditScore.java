package Day34_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore();

        int score = getCreditScore();
        System.out.println(score);

        System.out.println(getCreditScore());
        System.out.println(getCreditScore() + 50);

        System.out.println(isGoodCreditScore(680));
        System.out.println(isGoodCreditScore(720));
        System.out.println(isGoodCreditScore(getCreditScore()));



    }

    public static int getCreditScore(){
        return 800;

    }

    public static boolean isGoodCreditScore(int creditScore){
        if(creditScore >= 700){
            return true;
        }else{
            return false;
        }

    }



    }





