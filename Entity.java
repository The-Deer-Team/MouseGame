/**
 * Entity
 */
public class Entity {

    int posX, posY;
    int width, height;
    double speedX, speedY;
    double x, y;

    public void move() { // called to move the Entity
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
}


/**
 * Player

class Player extends Entity {

    public Player() {
        x = 400;
        y = 400;
        posX = (int) x;
        posY = (int) y;
        speedX = 0;
        speedY = 0;
    }

    public void IamSpeed(int key) {
        switch (key) {
            case 1: // w
                speedY += 20; //pls modify those vals
                break;
            case 2: // a
                speedX -= 10;
                break;
            case 3: // s
                speedY -= 5;
                break;
            case 4: // d
                speedX += 10;
                break;
            default:
                break;
        }
    }
}
*/