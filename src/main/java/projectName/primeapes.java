package projectName;

public class primeapes {
private String strength;
private int age;
private String name;

public String toString() {
    String info = "\nIs " + strength + "\nIs " + age + " years old." + "\nName is " + name;
    return info;
}

public primeapes() {
    this.strength = "";
    this.age = 1;
    this.name = "";
}

public primeapes(String strength, int age, String name) {
    this.age = age;
    this.strength = strength;
    this.name = name;
}
public String getStrength() {
    return strength;
}

public void setStrength(String newStrength) {
    this.strength = newStrength;
}

public void setAge(int newAge) {
    this.age = newAge;
}

public int getAge() {
    return age;
}
public void setStrength(int newAge) {
    this.age = newAge;
}
public String getName() {
    return name;
}
public void setName(String newName) {
    this.name = newName;
}
}





