/*
Gravity engine
*/
public class Gravity {

     public double gravitystrength = 9.81;
     public double gamefactor = 2;
    /* public double x, y; // player position, to be replaced if necessary,
     // mainly a placeholder for variable to be from player class
     */

     public void gravity(double gtsgth) {
         gtsgth = gravitystrength / gamefactor;
         if(Gravity.hitTheFloor() == false){
             player.y += gtsgth;
         }
    }
     public boolean hitTheFloor(Player player) {
         if (isApproxEqual(player.y-y,-player.height) || isApproxEqual(player.y-y, height)) {// dunno which one is the bottom one, dpends on how u defined it
            return true;
         }
         return false;
    }
}
