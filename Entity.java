/**
 * Entity
 */
public class Entity {

    int posX, posY;
    int width, height;
    double speedX, speedY;
    double maxSpeedX, maxSpeedY;
    double x, y;
    final static double gravity_strength = 9.81;

    public void move() { // called to move the Entity
        if (Math.abs(speedX) > maxSpeedX) {
            speedX = (speedX / Math.abs(speedX)) * maxSpeedX;
            
        }
        if (Math.abs(speedY) > maxSpeedY) {
            speedY = (speedX / Math.abs(speedX))* maxSpeedY;
        }
        x += speedX;
        y += speedY;
    }

    public void bounceX() { // called on collision in X direction
        speedX *= -1;
    }

    public void bounceY() { // called on collision in Y direction
        speedY *= -1;
    }

    public void adjustPosition() {
        posX = (int) x;
        posY = (int) y;
    }

    public void gravity() {
        speedY += gravity_strength;
    }

    public void friction() {
        if (speedX != 0 && Mouseman.code != 0) {
            speedX -= (speedX / Math.abs(speedX)) * function(speedX);
            System.out.println(speedX);
        }
        if (Math.abs(speedX) < 0.9) {
           speedX = 0;
        }
    }

    private double function(double x) {
        double f = -Math.abs(x) / 2;
        double h = Math.pow(Math.E, f) + 1;
        return h;
    }

}

/**
 * Player
 * 
 * class Player extends Entity {
 * 
 * public Player() { x = 400; y = 400; posX = (int) x; posY = (int) y; speedX =
 * 0; speedY = 0; }
 * 
 * public void IamSpeed(int key) { switch (key) { case 1: // w speedY += 20;
 * //pls modify those vals break; case 2: // a speedX -= 10; break; case 3: // s
 * speedY -= 5; break; case 4: // d speedX += 10; break; default: break; } } }
 */
