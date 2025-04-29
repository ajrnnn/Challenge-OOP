public class Challenge3 {
    private String name;
    private int marks;

    public Challenge3(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void checkPassStatus() {
        if (marks >= 50) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }

    public static void main(String[] args) {
        // Create an object and check pass status
        Challenge3 student1 = new Challenge3("Alice", 70);
        student1.checkPassStatus();

        Challenge3 student2 = new Challenge3("Bob", 45);
        student2.checkPassStatus();
    }
}
