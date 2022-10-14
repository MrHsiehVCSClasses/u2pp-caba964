package projectName;

public class monkey extends primeapes {
    private double penisSize;
    private boolean tail;
    private boolean banana;

    public String toString() {
        String info = "\n";
        info += super.toString();
        info += "\nAn average monkey penis size is: " + penisSize + "\nMonkey has tail: " + tail + "\nMonkey has banana: " + banana;
        return info;
    }

public monkey() {
    super();
    this.penisSize = 0.0;
    this.tail = false;
    this.banana = false;
    }

    public monkey(String strength, int age, String name, double newPenisSize, boolean hasTail, boolean hasBanana) {
        super(strength, age, name);
        this.penisSize = newPenisSize;
        this.tail = hasTail;
        this.banana = hasBanana;
    }
    public double getPenisSize() {
        return penisSize;
    }
    
    public void setPenisSize(double newPenisSize) {
        this.penisSize = newPenisSize;
    }

    public boolean gethasTail() {
        return tail;
    }
    
    public void sethasTail(boolean hasTail) {
        this.tail = hasTail;
    }

    public boolean gethasBanana() {
        return banana;
    }
    
    public void sethasBanana(boolean hasBanana) {
        this.banana = hasBanana;
    }
}
