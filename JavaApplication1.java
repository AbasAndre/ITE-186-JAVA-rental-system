package javaapplication1;
import java.util.Scanner;
import java.time.LocalDate;
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        int Selected = 5;
        int previousNumber = -1;
        LocalDate today = LocalDate.now();
        LocalDate expirationDate = today.plusMonths(1);
        

        System.out.println("-------------------------------------------------------------");
        System.out.println("*                    RENTING SYSTEM                     *");
        System.out.println("-------------------------------------------------------------");
        
        while (true) {
            try {
                System.out.println("");
                System.out.println("1. View rooms & Monthly Rent");
                System.out.println("2. Rent a room");
                System.out.println("3. EXIT");
                System.out.print("Please select an option: ");
                option = input.nextInt();
                
                
                if (option == 1){
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Room 1 have water, electricity and 1 single bed good for only one people. Monthly Rent: 1500");
                    System.out.println("Room 2 have water, electricity and 1 single bed good for only one people. Monthly Rent: 1500");
                    System.out.println("Room 3 have water, electricity and also have one bedroom, This room good for one people. Monthly Rent: 1500");
                    System.out.println("Space 4 have water, electricity and also good for sari-sari store. Monthly Rent: 2500");
                    System.out.println("--ALL WATER, ELECTRICITY AND ETC. ARE INCLUDED TO MONTHLY RENT--");
                    System.out.println("-------------------------------------------------------------");
                    
                } else if (option == 2) {
                    
                    
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("ALL ROOM HAS A DISCOUNT OF 10%");
                    System.out.println("1. ROOM 1 PRICE: 1500");
                    System.out.println("2. ROOM 2 PRICE: 1500");
                    System.out.println("3. ROOM 3 PRICE: 1500");
                    System.out.println("4. SPACE 4 PRICE: 3500");
                    System.out.println("5. EXIT");
                    System.out.print("Select rooms: ");
                    Selected = input.nextInt();
                    
                    if (Selected == previousNumber) {
                        System.out.println("----------- SORRY. THE ROOOM YOU SELECT ARE ALREADY OCCUPIED PLEASE SELECT ANOTHER ROOMS OR SPACE. -----------");
                        continue;
                    } else {
                        previousNumber = Selected; 
                    }
                    
                    if (Selected == 1 ) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.print("Name: ");
                        String Name = input.next();
                        System.out.print("LastName: ");
                        String LastName = input.next();
                        System.out.print("MiddleName: ");
                        String MiddleName = input.next();
                        System.out.print("Address: ");
                        String Address = input.next();
                        System.out.print("Contact number: ");
                        int Contact = input.nextInt();
                        System.out.println("-------------------------------------------------------------");
                        
                       
                        
                        System.out.print("Enter amount of cash: ");
                        int cash = input.nextInt();
                        double TotalChange;
                        int cost = 1500;
                        double discountPercentage = 0.1;
                        double money, change, balance, percentage;
                        System.out.println("-------------------------------------------------------------");
                        
                        if (cash > cost) {
                            change = cash - cost;
                            discountPercentage = change * discountPercentage;
                            TotalChange = discountPercentage + change;
                            System.out.println("Room 1 has been occupied for " + LastName + "," + Name + " " + MiddleName);
                            System.out.println("Change: " + change);
                            System.out.println("Discount: " + discountPercentage);
                            System.out.println("TotalChange: " + TotalChange);
                            System.out.println("Address: " + Address );
                            System.out.println("Contact: " + Contact);
                            System.out.println("Rent at: " + today );
                            System.out.println(" Date until: " + expirationDate);
                            System.out.println("-------------------------------------------------------------");
                            
                            
                        } else if (cash < cost){
                            balance = cash - cost;
                            System.out.println("Not enough money! but can rent with a balance of ");
                            System.out.println("Balance: " + balance);
                            System.out.println("Date rent today: " + today);
                            System.out.println("Date until: " + expirationDate);
                            System.out.println("Room 1 has been occupied for " + LastName + "," + Name + " with a balance of: " + balance);
                            System.out.println("Address: " + Address );
                            System.out.println("Contact: " + Contact);
                            System.out.println("-------------------------------------------------------------");
                                                    
                        }
                    } else if (Selected == 2) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.print("Name: ");
                        String Name = input.next();
                        System.out.print("LastName: ");
                        String LastName = input.next();
                        System.out.print("MiddleName: ");
                        String MiddleName = input.next();
                        System.out.print("Address: ");
                        String Address = input.next();
                        System.out.print("Contact number: ");
                        int Contact = input.nextInt();
                        System.out.println("-------------------------------------------------------------");
                        
                        System.out.print("Enter amount of cash: ");
                        int cash = input.nextInt();    
                        double TotalChange;
                        int cost = 1500;
                        double discountPercentage = 0.1;
                        double money, change, balance, percentage;
                        System.out.println("-------------------------------------------------------------");
                       
                        if (cash > cost) {
                            change = cash - cost;
                            discountPercentage = change * discountPercentage;
                            TotalChange = discountPercentage + change;
                            System.out.println("Room 2 has been occupied for " + LastName + "," + Name + " " + MiddleName);
                            System.out.println("Change: " + change);
                            System.out.println("Discount: " + discountPercentage);
                            System.out.println("TotalChange: " + TotalChange);
                            System.out.println("Address: " + Address );
                            System.out.println("Contact: " + Contact);
                            System.out.println("Rent at: " + today );
                            System.out.println(" Date until: " + expirationDate);
                            System.out.println("-------------------------------------------------------------");
                            
                        } else if (cash < cost) {
                            balance = cash - cost;
                            System.out.println("Not enough money! but can rent with a balance of ");
                            System.out.println("Balance: " + balance);
                            System.out.println("Date rent today: " + today);
                            System.out.println("Date until: " + expirationDate);
                            System.out.println("Room 2 has been occupied for " + LastName + "," + Name + " with a balance of: " + balance);
                            System.out.println("Address: " + Address );
                            System.out.println("Contact: " + Contact);
                            System.out.println("-------------------------------------------------------------");
                        }
                    } else if (Selected == 3) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.print("Name: ");
                        String Name = input.next();
                        System.out.print("LastName: ");
                        String LastName = input.next();
                        System.out.print("MiddleName: ");
                        String MiddleName = input.next();
                        System.out.print("Address: ");
                        String Address = input.next();
                        System.out.print("Contact number: ");
                        int Contact = input.nextInt();
                        System.out.println("-------------------------------------------------------------");
                        
                        System.out.print("Enter amount of cash: ");
                        int cash = input.nextInt();
                        double TotalChange;
                        int cost = 1500;
                        double discountPercentage = 0.1;
                        double money, change, balance, percentage;
                        System.out.println("-------------------------------------------------------------");
                        
                        if (cash > cost) {
                            change = cash - cost;
                            discountPercentage = change * discountPercentage;
                            TotalChange = discountPercentage + change;
                            System.out.println("Room 3 has been occupied for " + LastName + "," + Name + " " + MiddleName);
                            System.out.println("Change: " + change);
                            System.out.println("Discount: " + discountPercentage);
                            System.out.println("TotalChange: " + TotalChange);
                            System.out.println("Address: " + Address );
                            System.out.println("Contact: " + Contact);
                            System.out.println("Rent at: " + today );
                            System.out.println(" Date until: " + expirationDate);
                            System.out.println("-------------------------------------------------------------");
                            
                        } else if (cash < cost) {
                            balance = cash - cost;
                            System.out.println("Not enough money! but can rent with a balance of ");
                            System.out.println("Balance: " + balance);
                            System.out.println("Date rent today: " + today);
                            System.out.println("Date until: " + expirationDate);
                            System.out.println("Room 3 has been occupied for " + LastName + "," + Name + " with a balance of: " + balance);
                            System.out.println("Address: " + Address );
                            System.out.println("Contact: " + Contact);
                            System.out.println("-------------------------------------------------------------");
                        }
                    } else if (Selected == 4) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.print("Name: ");
                        String Name = input.next();
                        System.out.print("LastName: ");
                        String LastName = input.next();
                        System.out.print("MiddleName: ");
                        String MiddleName = input.next();
                        System.out.print("Address: ");
                        String Address = input.next();
                        System.out.print("Contact number: ");
                        int Contact = input.nextInt();
                        System.out.println("-------------------------------------------------------------");
                        
                        System.out.print("Enter amount of cash: ");
                        int cash = input.nextInt();
                        double TotalChange;
                        int cost = 3500;
                        double discountPercentage = 0.2;
                        double money, change, balance, percentage;
                        System.out.println("-------------------------------------------------------------");
                        
                        if (cash > cost) {
                            change = cash - cost;
                            discountPercentage = change * discountPercentage;
                            TotalChange = discountPercentage + change;
                            System.out.println("Room 4 has been occupied for " + LastName + "," + Name + " " + MiddleName);
                            System.out.println("Change: " + change);
                            System.out.println("Discount: " + discountPercentage);
                            System.out.println("TotalChange: " + TotalChange);
                            System.out.println("Address: " + Address );
                            System.out.println("Contact: " + Contact);
                            System.out.println("Rent at: " + today );
                            System.out.println(" Date until: " + expirationDate);
                            System.out.println("-------------------------------------------------------------");
                            
                        } else if (cash < cost) {
                            balance = cash - cost;
                            System.out.println("Not enough money! but can rent with a balance of ");
                            System.out.println("Balance: " + balance);
                            System.out.println("Date rent today: " + today);
                            System.out.println("Date until: " + expirationDate);
                            System.out.println("Room 4 has been occupied for " + LastName + "," + Name + " with a balance of: " + balance);
                            System.out.println("Address: " + Address );
                            System.out.println("Contact: " + Contact);
                            System.out.println("-------------------------------------------------------------");
                        } else if (option == 5 ) {
                            System.out.println("PROGRAMM EXIT. THANK YOU!");
                            continue;
                        }
                        System.out.println("");
                        System.out.println("-------------------------------------------------------------");
                        System.out.println(" -------- All rooms are already occupied right now. -------- ");
                        System.out.println("-------------------------------------------------------------");
                    }  
                    
                } else if (option == 3 ) {
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("PROGRAMM EXIT.");
                    System.out.println("-------------------------------------------------------------");
                    break;
                    
                } else if (option < 1 || option > 3) {
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("* Invalid. Please choose a number from the following list. *");
                    System.out.println("-------------------------------------------------------------");
                    
                } else if (Selected < 1 || Selected > 5 ) {
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("* Invalid. Please choose a number from the following list. *");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("");
                System.out.println("-------------------------------------------------------------");
                System.out.println("* Invalid. Please choose a number from the following list. *");
                input.next();
                System.out.println("-------------------------------------------------------------");
            }                  
       }
    }
    
}