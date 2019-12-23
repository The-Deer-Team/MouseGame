/**
 * World
 */
public class World {
    
    /////// PLayer
    public Player P;
    /////// Other Entities
    /////// Obstacles O
    public Platforms[] platforms;

    public World() {

        /////// PLayer
        P = new Player();

        /////// Other Entities

        /////// Obstacles O
        platforms = new Platforms[5];
        platforms[0] = new Platforms(200, 200, 100, 20);
        platforms[1] = new Platforms(500, 300, 150, 30);
        platforms[2] = new Platforms(300, 400, 100, 20);
        platforms[3] = new Platforms(0, 700, 800, 20);
        platforms[4] = new Platforms(0, 0, 800, 20);
    }

    public void update() {
        for (Platforms platform : platforms) {
            if (platform.collideX(P)) {
                System.out.println("X "+P.x+", "+P.y);
                P.bounceX();
            }else if (platform.collideY(P)){
                System.out.println("Y "+P.x+", "+P.y);
                P.bounceY();
            }
        }
    }
    public void trackPlayer() {
        
    }
}