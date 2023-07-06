import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Map<String, Employee> staff = new HashMap<>();
        boolean quit = false;
        String menuItem;
        do {
            System.out.println("===============================");
            System.out.println("Choose menu item: ");
            System.out.println("1. Add or Save Employee ");
            System.out.println("2. Get details on Employee ");
            System.out.println("3. Update/Modify Details ");
            System.out.println("4. Delete Employee ");
            System.out.println("5. Print all employees ");
            System.out.println("0. Quit Application ");
            System.out.println("===============================\n");
            menuItem = menu.next();
            switch (menuItem) {
                case "1":
                    System.out.println("Enter ID: ");
                    String eID = sc1.nextLine();
                    if (staff.containsKey(eID)) {
                        System.out.println("That Id is already in use Try again !!!");
                        break;
                    } else
                        System.out.println("Enter Name: ");
                    String eName = sc1.nextLine();
                    System.out.println("Enter Email: ");
                    String eEmail = sc1.nextLine();
                    System.out.println("Enter Address: ");
                    String location = sc1.nextLine();
                    Employee emp = new Employee(eID, eName, eEmail, location);
                    staff.put(eID, emp);

                    System.out.println("Details has Saved");
                    break;
                case "2":
                    System.out.println("Enter Employee ID: ");
                    String getID = sc1.next();

                    if (staff.containsKey(getID)) {
                        System.out.println(staff.get(getID));
                    } else {
                        System.out.println("Invalid ID!");
                    }
                    break;

                case "3":
                    System.out.println("Enter Employee ID: ");
                    String modID = sc1.next();
                    if (staff.containsKey(modID)) {
                        System.out.println(staff.get(modID));
                        System.out.println("Which filed should be modify/update ?");
                        System.out.println("1. Employee name ");
                        System.out.println("2. Employee email ");
                        System.out.println("3. Employee address ");
                        int menuItem2 = menu.nextInt();
                        switch (menuItem2) {
                            case 1:
                                System.out.println("Enter name to update/modify ");
                                String modName = sc1.next();
                                staff.get(modID).setEmployeeName(modName);
                                System.out.println(staff.get(modID));
                                System.out.println(" Employee name Has been Changed");
                                break;
                            case 2:
                                System.out.println("Enter email to update/modify ");
                                String modEmail = sc1.next();
                                staff.get(modID).setEmployeeEmail(modEmail);
                                System.out.println(staff.get(modID));
                                System.out.println(" Employee email Has been Changed");
                                break;
                            case 3:
                                System.out.println("Enter address to update/modify ");
                                String modAddress = sc1.next();
                                staff.get(modID).setEmployeeLocation(modAddress);
                                System.out.println(staff.get(modID));
                                System.out.println(" Employee address Has been Changed");
                                break;
                            default:
                                System.out.println("Invalid Field!");
                        }
                    } else {
                        System.out.println("Invalid ID!");
                    }

                    break;
                case "4":
                    System.out.println("Enter Employee ID: ");
                    String delID = sc1.next();
                    if (staff.containsKey(delID)) {
                        staff.remove(delID);
                        System.out.println("Employee ID " + delID + " has been deleted");
                    } else {
                        System.out.println("Invalid ID!");
                    }
                    break;
                case "5":
                    System.out.println("All employees");
                    System.out.println(staff);
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (!quit);
        System.out.println("Application Ended!");
    }
}