/**
 * Platforms
 */
public class Platforms {

    public int x, y;
    public int width, height;

    public Platforms(int x_position, int y_position, int plat_width, int plat_height) {
        x = x_position;
        y = y_position;
        width = plat_width;
        height = plat_height;
    }

    public boolean collideX(Player player) {
        if (isApproxEqual(player.x - x, player.width) || isApproxEqual(player.x - x, width)) {
            return true;
        }
        return false;
    }
    // if(player.x<x+width && player.x+player.width>x &&
    // player.y<y+height && player.y+player.height>y){
    // // if (Math.abs(player.x-x) <= width){
    // // return true;
    // // }else if(Math.abs(x-player.x) <= player.width){

    // // }

    // System.out.println("yep "+player.y+" - "+y+" = "+(player.y-y)+" // " + height
    // +" player height: "+player.height);
    // if (! (player.y-y<=height) && !(Math.abs(y-player.y)<=player.height)){
    // return true;
    // }
    // }

    // return false;
    // }
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