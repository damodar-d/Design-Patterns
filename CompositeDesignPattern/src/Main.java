//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Directory d = new Directory("Projects");
        d.addToDirectory(new File("projects.readme"));
        Directory d1 = new Directory("Java");
        Directory exceptionHandling = new Directory("Exception Handling");
        exceptionHandling.addToDirectory(new File("Main.java"));
        exceptionHandling.addToDirectory(new File("Exception.java"));
        d1.addToDirectory(exceptionHandling);
        d1.addToDirectory(new Directory("Multi-Threading"));
        d.addToDirectory(d1);
        d.ls();
    }
}