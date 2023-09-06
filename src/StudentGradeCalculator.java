import java.util.Scanner;

public class StudentGradeCalculator {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter the number of Subjects :");
            int subjects=sc.nextInt();

            int[]marks=new int[subjects];
            int tm=0;


            for(int i=0;i<subjects;i++)
            {
                System.out.println("Enter the marks for Subjects "+(i+1)+" : ");
                marks[i]=sc.nextInt();
                tm+=marks[i];

            }

            double avgpercentage =(double)tm/(subjects*100)*100;

            char grade;

            if(avgpercentage>=90) {
                grade = 'A';
            }
            else if(avgpercentage>=80) {
                grade = 'B';
            }
            else if (avgpercentage>=70) {
                grade = 'C';
            }
            else if(avgpercentage>=60)
            {
                grade = 'D';
            }
            else{
                grade = 'F';
            }

            System.out.println("Total Marks :"+tm);
            System.out.println("Average Percentage:"+avgpercentage+"%");
            System.out.println("Grade :"+grade);






        }

    }

