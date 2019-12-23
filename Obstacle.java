 /**
  * Obstacle
  */
 public class Obstacle {
 
    public int x, y;
    public int width, height;

    public boolean collideX(Player player) {
        if (isApproxEqual(player.x - x, player.width) || isApproxEqual(player.x - x, width)) {
            return true;
        }
        return false;
    }
    
    public boolean collideY(Player player) {
        if (isApproxEqual(player.y-y,-player.height) || isApproxEqual(player.y-y, height)) {
            return true;
        }
        return false;
    }

    private boolean isApproxEqual(double a, double b) {
        double err = 0.05 * a;
        if (a + err > b && a - err < b) {
            return true;
        }
        return false;
    }
 }