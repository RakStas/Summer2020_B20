package Day11_Nestedif_Swift_Ternary;

public class Nestedif_Practise2 {
    public static void main(String[] args) {

        int day = 7;
        boolean validNumder = day >= 1 && day <= 7;
        String result = "";

        if (validNumder) {
            if(day==1) {
                result="Monday";
            } if(day==2) {
                result="Tuesday";
            }else if(day==3) {
                result="Wednesday";
            }else if(day==4) {
                result="Thursday";
            }else if(day==5) {
                result="Friday";
            }else if(day==6) {
                result="Saturday";
            }else  {
                result="Sunday";
            }
            }else System.out.println("There is not that day");

            result=(day==1)?"Monday":(day==2)?"Tuesday":(day==3)?"Wednesday"
                    :(day==4)?"Thursday":(day==5)?"Friday":(day==6)?"Saturday":"Sunday";
            System.out.println(result);


        }
    }

