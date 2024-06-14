package modules.game;

public class Position {
    private final int x;
    private final int y;
    public Position(int a, int b){
        x = a;
        y = b;
    }
    public int getX() { return x; }
    public int getY(){
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Position p = (Position) o;
        return x == p.getX() && y == p.getY();
    }

    public Position up(){
        return new Position(x, y - 1);
    }

    public Position right(){
        return new Position(x + 1, y);
    }

    public Position left(){
        return new Position(x - 1, y);
    }

    public Position down(){
        return new Position(x, y + 1);
    }

}
