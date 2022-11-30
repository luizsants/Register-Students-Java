import java.util.ArrayList;
import java.util.Scanner;

public class Aluno{

    String name;
    int age;

    public Aluno(String name2, int age){
        this.age = age;
        this.name = name2;
    }

    public static void main(String[] args) {
        // ArrayList<String> name = new ArrayList<>();
        
        int aux = 0, age = 0, x;
        boolean verify = true;
        Scanner scan = new Scanner(System.in);

        while(verify){
            System.out.println("Well come to Student Dashboard");    
            System.out.println("Choose an option down below with a NUMBER");    
            System.out.println("1 - Set up the Student");
            System.out.println("2 - Set up the Student Course");
            System.out.println("3 - Set up the Student School");
            System.out.print("Option: ");
            
                aux = scan.nextInt();
                for (x=1;x<=3;x++)                                            {
                    if (aux == x) {
                        switchcase(aux);
                        verify = false;
                    }else{
                        System.out.println("Please choose a valid option");
                    }
                }       
            

            
        }
        scan.close();
    }

    public static void switchcase(int option){

        Scanner scan1 = new Scanner(System.in);
        boolean StudentRegister = true;
        int aux, x;
        String DigitedName;
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        String school, course;

        switch(option){
            case 1:
                System.out.println("Please input the Student Name: ");
                DigitedName = scan1.next();
                name.add(DigitedName);
                System.out.println("Please input the Student Age: ");
                age.add(scan1.nextInt());

                while(StudentRegister){
                    System.out.println("What next?");
                    System.out.println("1. Do you wanna go back?");
                    System.out.println("2. Add another Student?");
                    System.out.println("3. Register the Course/School of the "+DigitedName+" student?");
                    aux = scan1.nextInt();
                    if(aux == 1){

                    } else if(aux == 2){

                    }
                    else if (aux == 3){

                    }else{System.out.println("Please Digite a Valid Number");}

                }
                
                break;
            case 2:
                System.out.println("Please input the Student Course: ");

                break;
            case 3:
                System.out.println("Please input the Student School: ");
                school = scan1.next();
                break;
        }
        scan1.close();
    }
}


