package modules;


import modules.game.Position;

public abstract class Element{
    private Position position;
    public Element(int a, int b){
        position = new Position(a,b);
    }

    public Position getPosition(){
        return position;
    }
    public void setPosition(Position x) { position = x; }
}
