package game;

import java.awt.*;

public class Item {
    private int x;
    private int y;
    private int size;
    Image image;

    public void setImage(Image image) {
        this.image = image;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Item(int x, int y, int size, Image image){
        setX(x);
        setY(y);
        setSize(size);
        setImage(image);
    }
}
