public class Redeem{
    public static void main(String[] args){
        PeaksAndValleys("CCCC");
    }
    public static void PeaksAndValleys(String s){
        int level = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                level++;
            }
            else if(s.charAt(i) == 'C'){
                level--;
            }
        }
        if (level > 0){
            System.out.printf("%d level(s) up", level);
        }
        else if (level < 0){
            System.out.printf("%d level(s) down", Math.abs(level));
        }
        else{
            System.out.printf("level");
        }
    }
}