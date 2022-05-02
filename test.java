import java.util.*;

public class test
{

public static void main(String[] args)
{
//code to read values
//code to call required method
//code to calculate Grade and display the results
    int totalMatches;
    Player[] player = new Player[4];
    
    Scanner sc = new Scanner(System.in);

    for(int i=0 ; i<player.length;i++){
        int playerId = sc.nextInt();
        sc.nextLine();
        String playerName = sc.nextLine();
        int iccRank = sc.nextInt();
        int noOfMatchesPlayed = sc.nextInt();
        int totalRunsScored = sc.nextInt();
        //sc.nextInt();
        player[i] = new Player(playerId, playerName, iccRank, noOfMatchesPlayed, totalRunsScored);
    }
    totalMatches = sc.nextInt();
    sc.close();
    double runRate[] = findAverageScoreOfPlayers(player, totalMatches);

    for(int i=0; i < (int)runRate.length; i++){
        if(runRate[i] >= 80){
            System.out.println("Grade A Player");
        }
        else if(runRate[i] >= 50 && runRate[i] <= 79){
            System.out.println("Grade B Player");
        } else System.out.println("Grade C Player");
    }
}

public static double[] findAverageScoreOfPlayers(Player[] player,int totalMatches)
{
//method logic
/*The method will calculate the average runrate of the player based on totalRunsScored and
noOfMatchesPlayed and return the same in a double array where the noOfMatchesPlayed attribute
is greater than or equal to the int parameter target passed. */

    double runRate[] = new double[0];
    for(int i=0; i<player.length; i++){
        if(player[i].getNoOfMatchesPlayed() >= totalMatches){
            runRate = Arrays.copyOf(runRate, runRate.length+1);
            runRate[runRate.length-1] = (double) (player[i].getTotalRunsScored()/player[i].getNoOfMatchesPlayed());
        }
    }
    return runRate;
}
}

class Player
{
//code to build player class
int playerId;
String playerName;
int iccRank;
int noOfMatchesPlayed;
int totalRunsScored;

Player(int playerId, String playerName, int iccRank, int noOfMatchesPlayed, int totalRunsScored){
    this.playerId = playerId;
    this.playerName = playerName;
    this.iccRank = iccRank;
    this.noOfMatchesPlayed = noOfMatchesPlayed;
    this.totalRunsScored = totalRunsScored;
}

public int getPlayerId(){
    return playerId;
}

public String getPlayerName(){
    return playerName;
}

public int getIccRank(){
    return iccRank;
}

public int getNoOfMatchesPlayed(){
    return noOfMatchesPlayed;
}

public int getTotalRunsScored(){
    return totalRunsScored;
}

}