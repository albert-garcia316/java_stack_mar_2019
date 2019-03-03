public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.trimAndConcat("  Hello  ", "  World!  "));
        System.out.println(manipulator.getIndexOrNull("Hello Coding Dojo Ninjas", 'd'));
        System.out.println(manipulator.getIndexOrNull("Hello Coding Dojo Ninjas", "Dojo"));
        System.out.println(manipulator.concatSubstring("Hello", 1, 2, "world"));
    }
}