import  processing.core.PApplet;

public class challenge_four_balls_oop extends PApplet{

    private static final int WIDTH = 640;
    private static final int HEIGHT = 400;
    private static final int TOTAL_NUMBER_OF_BALLS = 4;
    private static final int DIAMETER = 10;
    private Ball[] FOURBALLS;

    public static void main(String[] args) {
        PApplet.main("challenge_four_balls_oop",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        FOURBALLS=new Ball[TOTAL_NUMBER_OF_BALLS];
        int ballNumber;
        for(ballNumber =0; ballNumber <TOTAL_NUMBER_OF_BALLS; ballNumber++)
        {
            FOURBALLS[ballNumber] = new Ball(DIAMETER,HEIGHT,TOTAL_NUMBER_OF_BALLS, ballNumber +1);
        }
    }

    @Override
    public void draw()
    {
        for(Ball each_ball : FOURBALLS)
        {
            each_ball.drawCircle(this);
        }
    }


}
