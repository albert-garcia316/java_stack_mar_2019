import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    List<Project> projects = new ArrayList<>();

    public void addProject(Project project){
        this.projects.add(project);
    }
    public void getProjects(){
        System.out.println(this.projects);
    }
    public double getPortfolioCost(){
        double output = 0.00;
        for(Project p : this.projects){
            output += p.initialCost;
        }
        return output;
    }
    public void showPortfolio(){
        for(Project p : this.projects){
            System.out.println(p.elevatorPitch());
        }
        System.out.println(this.getPortfolioCost());
    }
}