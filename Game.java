import java.util.Scanner;

public class Game
{
private Level levelOne;
private Level levelTwo;
private Level levelThree;
private boolean bonus;
/** Postcondition: All instance variables have been initialized. */
public Game()
{levelOne = new Level();
levelTwo = new Level();
levelThree = new Level(); }
/** Returns true if this game is a bonus game and returns false otherwise */
public boolean isBonus()
{ return bonus; }
/** Simulates the play of this Game (consisting of three levels) and updates all relevant
* game data
*/
public void makeBonus(){
    bonus = true;
}
public Level getLevel(int i){
    if(i==1) return levelOne;
    if (i==2) return levelTwo;
    if(i==3)return levelThree;
    return null;
}
public void play()
{System.out.println("Enter the number of points. "); 
Scanner s = new Scanner(System.in);
levelOne.setPoints(s.nextInt());
levelOne.reachGoal();
  }
/** Returns the score earned in the most recently played game, as described in part (a) */
public int getScore()
{ int points = 0;
if(levelOne.goalReached()){
    points+= levelOne.getPoints();
    if(levelTwo.goalReached()){
        points += levelTwo.getPoints();
        if(levelThree.goalReached()){
            points += levelThree.getPoints();
        }
    }
} 
if(isBonus()) points *=3;
return points;
    /* to be implemented in part (a) */ }
/** Simulates the play of num games and returns the highest score earned, as
* described in part (b)
* Precondition: num > 0
*/
public int playManyTimes(int num)
{ 
    int max = 0;
    while(num>0){
        play();
        int score = getScore();
        if(score>max) max = score;
        num--;
    }
    return max;
}
}