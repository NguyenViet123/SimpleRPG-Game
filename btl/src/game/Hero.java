package game;

import java.awt.*;

public class Hero extends Character{
    private int life = 5;
    State state;
    public  Hero(int x, int y, int size, Image image){
        super(x, y, size, image);
        state = new State(//abc);
    }
}
