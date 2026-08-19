
public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int rollNo = 1031;
        double cgpa = 8.5;

        System.out.println("\n==========================");
        System.out.println("   STUDENT MANAGEMENT");
        System.out.println("==========================");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("CGPA    : " + cgpa);
        System.out.println("Status  : PASS");
        System.out.println("==========================");

        sc.close();
    }
}