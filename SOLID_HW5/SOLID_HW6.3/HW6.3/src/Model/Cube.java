package Model;

public class Cube implements Shape, ThreeDShape {
    private int edge;
    
    public Cube(int edge) {
        this.edge = edge;
    }
     
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    
    // метод, присущий только классу Cube
    public double volume() {
        return edge * edge * edge;
    }
    
}
