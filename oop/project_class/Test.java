public class Test {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("project 2");
        Project p3 = new Project("project 3", "this is the third phase of our project");
        Portfolio portfolio = new Portfolio();
        p1.setName("project 1");
        p1.setDescription("this is the first phase");
        p1.setCost(100.00);
        System.out.println(p1.elevatorPitch());
        p2.setDescription("this is phase 2");
        p2.setCost(200.00);
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(p3.getDescription());
        p3.setDescription("This is no longer the third phase");
        p3.setCost(800.00);
        System.out.println(p3.elevatorPitch());
        portfolio.addProject(p1);
        portfolio.addProject(p2);
        portfolio.addProject(p3);
        portfolio.getProjects();
        System.out.println(portfolio.getPortfolioCost());
        portfolio.showPortfolio();
    }
}