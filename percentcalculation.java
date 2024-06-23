import java.util.Scanner;


public class percentcalculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number of subjects:");
        int numSubjects= sc.nextInt();
        int totalMarks=0;
        for(int i =1;i<=numSubjects;i++){
            System.out.println("Enter marks for subjects"+i+"(out of 100):");
            int marks =sc.nextInt();

            while(marks<0||marks>100){
                System.out.println("it's invalid marks enter number between 0 -100");
                System.out.println("Enter marks for subject " +i + "out of 100");
                marks = sc.nextInt();

            }
            totalMarks+= marks;
        }
        System.out.println("Student result:");
        System.out.println("Total marks obtained in all subjects :"+totalMarks);
        

        int AveragePercentage = totalMarks/numSubjects;
        System.out.println("Average percentage:" +AveragePercentage);
        if(AveragePercentage>=90){
            System.out.println("your grade is :-A1");
        }
        else if(AveragePercentage>=80){

        System.out.println("your grade is :A2");
        }
        else if(AveragePercentage>=70){
          System.out.println("your grade is B1");  
        }
        else if(AveragePercentage>=60){
            System.out.println("your grade is :C");
        }
        else if(AveragePercentage>=50){
            System.out.println("your grade is: D");
        }
        else if(AveragePercentage>=40){
            System.out.println("your grade is :E");
        }
        else{
            System.out.println("your grade is :F");
        }
sc.close();
        }
    }
    

