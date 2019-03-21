public class FirstProgram {
    public static void main(String[] args){
        String name = "Albert Garcia";
        int age = 28;
        String homeTown = "Amarillo, TX";
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My home town is " + homeTown);

        String[] a = {"jan", "feb", "march"};
        String output = "";
        for(int i = 0; i < a.length; i++){
            output += a[i] + " ";
        }
        System.out.println(output);
    }
}