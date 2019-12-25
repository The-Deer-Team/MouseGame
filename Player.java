/*
player
*/


public class Player extends Entity {

    public Player() {
        x = 400;
        y = 400;
        posX = (int) x;
        posY = (int) y;
        speedX = 0;
        speedY = 0;
        width = 20;
        height = 50;
        maxSpeedX = 10;
        maxSpeedY = 40;
    }


    public void IamSpeed(int key) {
        switch (key) {
        case 1: // w
            speedY -= 20; // pls modify those vals
            break;
        case 2: // a
            speedX -= 5;
            break;
        case 3: // s
            //speedY -= 5;
            break;
        case 4: // d
            speedX += 5;
            break;
        default:
            break;
        }
        if (key!=0){
        System.out.println(key+" "+speedX+" , "+speedY+";   "+x+", "+y+";  "+posX+", "+posY);
        }
    }

    public void update() {
        //gravity();
        friction();
        move();
        adjustPosition();
    }
        
/*
In this farewell
There's no blood, there's no alibi
'Cause I've drawn regret
From the truth of a thousand lies
So let mercy come and wash away
What I've done
I'll face myself
To cross out what I've become
Erase myself
And let go of what I've done
Put to rest
What you thought of me
While I clean this slate
With the hands of uncertainty
So let mercy come and wash away
What I've done
I'll face myself
To cross out what I've become
Erase myself
And let go of what I've done
For what I've done
I start again
And whatever pain may come
Today this ends
I'm forgiving what I've done
I'll face myself
To cross out what I've become
Erase myself
And let go of what I've done
(Na-na na na)
(Na-na na na)
(Na-na na na)
What I've done
(Na-na na na)
(Na-na na na)
Forgiving what I've done
(Na-na na na)
(Na-na na na)
(Na-na na na)
(Na-na na)
*/

}
