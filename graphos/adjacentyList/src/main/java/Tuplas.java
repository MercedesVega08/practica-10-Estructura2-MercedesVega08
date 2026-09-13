import java.util.Objects;

public class Tuplas<X, Y>{

    public X x;
    
    public Y y;

    public Tuplas(X x, Y y){
        this.x = x;
        this.y = y;
    }

    public X getX(){ return  x;}

    public Y getY(){ return  y;}

    public void setX(X newX){ x = newX;}

    public void setY(Y newY){ y = newY;}

    @Override 
    public boolean equals(Object obj){
        if (this == obj) return true;
        
        if (obj == null || getClass() != obj.getClass()) return false;

        Tuplas<?, ?> otra = (Tuplas<?, ?>) obj;
        return Objects.equals(this.x, otra.x) && Objects.equals(this.y, otra.y);
    }

    public String toString(){
        String print = "(";

        print += x + ", " + y + ")";

        return print;
    }

}