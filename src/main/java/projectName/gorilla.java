package projectName;

public class gorilla extends primeapes {
    private double penisSize;
    private boolean muscles;

    public String toString() {
        String info = "\n";
        info += super.toString();
        info += "\nAn average gorillaz penis size is: " + penisSize + "\nGorilla has muscles: " + muscles;
        return info;
    }

    public gorilla() {
        super();
        this.penisSize = 0.0;
        this.muscles = false;
        }

    public gorilla(String strength, int age, String name, double newPenisSize, boolean hasMuscles) {
        super(strength, age, name);
        this.penisSize = newPenisSize;
        this.muscles = hasMuscles;
        }

    public double getPenisSize() {
        return penisSize;
        }
        
    public void setPenisSize(double newPenisSize) {
        this.penisSize = newPenisSize;
        }

    public boolean gethasMuscles() {
        return muscles;
        }

    public void sethasMuscles(boolean hasMuscles) {
        this.muscles = hasMuscles;
        }

}