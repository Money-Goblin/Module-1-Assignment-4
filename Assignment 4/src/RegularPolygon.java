public class RegularPolygon {
    //Initializing parameters
    private int n;
    private double sides;
    private double x;
    private double y;

    //Constructors with default values where needed
    public RegularPolygon(){
        n = 3;
        sides = 1;
        x = 0;
        y = 0;
    }
    public RegularPolygon(int n, double sides){
        n = this.n;
        sides = this.sides;
        x = 0;
        y = 0;
    }
    public RegularPolygon(int n, double sides, double x, double y){
        n = this.n;
        sides = this.sides;
        x = this.x;
        y = this.y;
    }

    //Accessor Methods
    public int getSideNum(){
        return n;
    }

    public double getSideLength(){
        return sides;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    //Mutator Methods
    public void setSideNum(int n){
        n = this.n;
    }

    public void setSideLength(double sides){
        sides = this.sides;
    }

    public void setX(double x){
        x = this.x;
    }

    public void setY(double y){
        y = this.y;
    }

    //Calculator Methods
    public double getPerimeter(){
        return n * sides;
    }

    public double getArea(){
        return (n * Math.pow(sides,2))/(4*Math.tan(Math.PI/n));
    }
}
