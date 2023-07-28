package Model;

public abstract class Vehicle { // родительский класс
    private int maxSpeed;
    private String type;

    // конструктор
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        }
    
    // методы
    public int getMaxSpeed() {
        return this.maxSpeed;
        }
    
    public String getType() {
        return this.type;
        }
    

    
    
}
