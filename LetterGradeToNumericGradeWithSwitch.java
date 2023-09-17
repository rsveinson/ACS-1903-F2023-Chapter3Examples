import java.util.Scanner;
/**
 * Letter grade translated to a numeric grade.
 */
public class LetterGradeToNumericGradeWithSwitch
{
    public static void main(String[] args)
    {

        String grade;
        double nGrade = 0.0;
        
        String st = "A";
        
        System.out.println("Enter letter grade:");
        Scanner kb = new Scanner(System.in);
        grade = kb.next();
        
        
        switch (grade) {
            case "a":
            case "A": nGrade = 4.0;
                break;
            case "b":
            case "B": nGrade = 3.0;
                break;
            case "C": nGrade = 2.0;
                break;
            case "D": nGrade = 1.0;
                break;
            case "F": nGrade = 0.0;
                break;
            default: System.out.println("invalid grad entered");
        }
        
        System.out.println(grade+" --> "+nGrade);
    }
}
