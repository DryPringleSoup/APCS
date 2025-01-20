import java.util.Scanner;

public class ColdCallingApp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] studentNames = {
        "Mickey Mouse", "SpongeBob SquarePants", "Bugs Bunny",
        "Dora the Explorer", "Scooby-Doo", "Tom Cat", "Jerry Mouse",
        "Bart Simpson", "Lisa Simpson", "Charlie Brown"};
        String[][] studentPerformance = new String[studentNames.length][2];
        for (int i = 0; i < studentNames.length; i++) {
            studentPerformance[i][0] = studentNames[i];
            studentPerformance[i][1] = "Not Graded";
        }
       
        boolean keepColdCalling = true;
        System.out.println("Select an option:");
            System.out.println("1. Call on a student");
            System.out.println("2. View all scores");
           
        while(keepColdCalling){
            System.out.print("Enter your number here: ");
            String option = sc.nextLine();
            switch(option){
                case "1":
                    int randomIndex = (int)(Math.random()*studentNames.length);
                    String selectedStudent = studentNames[randomIndex];
                    System.out.println("Student: "+selectedStudent);
                    System.out.print("Enter score for " + selectedStudent + ": ");
                    String score = sc.nextLine();
                    studentPerformance[randomIndex][1] = score;
                    break;
                case "2":
                    for (int i = 0; i < studentPerformance.length; i++) {
                        System.out.println(studentPerformance[i][0] + ": " + studentPerformance[i][1]);
                    }
                    break;
            }
           
            System.out.print("Countinue? (y/n): ");
            String answer = sc.nextLine();
            keepColdCalling = answer.equals("y") ? true : false;
        }
       
    }
}