package game;

public class State {
    private int hp;
    private int mp;
    private int dam, def;
    private int speed;
    private int orient;

    public State(int hp, int mp, int dam, int def, int speed, int orient){
        setHp(hp);
        setMp(mp);
        setDam(dam);
        setDef(def);
        setOrient(orient);
        setSpeed(speed);
    }

    public void setDam(int dam) {
        this.dam = dam;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setOrient(int orient) {
        this.orient = orient;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
