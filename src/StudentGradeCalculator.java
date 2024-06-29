import java.util.*;

public class StudentGradeCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("**********STUDENT GRADE CALCULATOR**********");

        String name, motherName;
        System.out.println("Enter the Student Name: ");
        name=sc.next();
        System.out.println("Enter the Student's Mother Name: ");
        motherName=sc.next();

        int numOfSubjects;
        System.out.println("Enter the number of subjects: ");
        numOfSubjects = sc.nextInt();

        int i, marks, totalMarks=0;
        for(i=1;i<=numOfSubjects;i++){
            System.out.println("Enter marks obtained the subject "+i+" :");
            marks = sc.nextInt();
            totalMarks+=marks;
        }

        double avgPercentage=(double)totalMarks/numOfSubjects;

        String grade;
        if(avgPercentage>=90){
            grade="O";
            System.out.println("********** CONGRATULATION'S...! You are Passed in the Examination with Distinction...! **********");
        }
        else if(avgPercentage>=80){
            grade="A";
            System.out.println("********** CONGRATULATION'S...! You are Passed in the Examination with Distinction...! **********");
        }
        else if(avgPercentage>=70){
            grade="B";
            System.out.println("********** CONGRATULATION'S...! You are Passed in the Examination...! **********");
        }
        else if(avgPercentage>=60){
            grade="C";
            System.out.println("********** CONGRATULATION'S...! You are Passed in the Examination...! **********");
        }
        else if(avgPercentage>=50){
            grade="D";
            System.out.println("********** CONGRATULATION'S...! You are Passed in the Examination...! **********");
        }
        else if(avgPercentage>=40){
            grade="E";
            System.out.println("********** CONGRATULATION'S...! You are Passed in the Examination...! **********");
        }
        else{
            grade="F";
            System.out.println("********** Oops, Your Bad Luck...! You are Failed in the Examination...! **********");
        }
        
        System.out.println("**********STUDENT'S RESULT**********");

        System.out.println("Student Name: "+name);
        System.out.println("Student's Mother Name: "+motherName);
        System.out.println("Your Total Marks Obtained: "+totalMarks);
        System.out.println("Your Average of the Percentage: "+avgPercentage);
        System.out.println("Your Grade is "+grade);
    }
}
