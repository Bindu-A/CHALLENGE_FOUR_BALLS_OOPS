import javafx.scene.Parent;
import  processing.core.PApplet;

public class Ball extends PApplet{
    private int xaxis=1;
    private int ball_number;
    private int diameter;
    private int yaxis;

    public Ball(int DIAMETER, int HEIGHT, int TOTAL_BALLS, int SPEED)
    {
        this.ball_number=SPEED;
        this.diameter=DIAMETER;
        this.yaxis=calposition(HEIGHT,TOTAL_BALLS);


    }

    private int calposition(int height, int total_balls) {
        return (height*ball_number)/(total_balls+1);
    }

    void drawCircle(PApplet PARENT) {
        PARENT.ellipse(xaxis,yaxis,diameter,diameter);
        this.xaxis+=ball_number;
    }



}
