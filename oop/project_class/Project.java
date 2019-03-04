public class Project {
    String name;
    String description;
    double initialCost;

    public Project(){
    }
    public Project(String name, String description){
        this(name);
        this.description = description;
    }
    public Project(String name){
        this.name = name;
    }
    public String elevatorPitch(){
        return this.name + " (" + this.initialCost + "): " + this.description;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCost(double cost){
        this.initialCost = cost;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public double getCost(){
        return this.initialCost;
    }
}