package grading;


public class GradingCalculator {
    public String  getGrade(int marks){
        if(marks >= 80){
            System.out.println("You score an A");
        }
        else if( marks >= 70 && marks < 79){
            return "You score a B";
        }
        else if(marks >= 60 && marks < 69 ){
            return "You socred a C Chajii🤣";
        }
        else if (marks >= 50 && marks < 59){
            return "You scored a D😆";
        }
        else if (marks >= 40 && marks < 49){
            return "Umewai E Bois🤣🤣🤣. Chuo tuliwai E!";
        }
        else{
            return "Too low. Just go home🏡";
        }

        return "";
    }


}

