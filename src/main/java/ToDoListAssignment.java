import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListAssignment {
    static class DailyToDoList {

        ArrayList<String> ToDoList = new ArrayList<String>();

        public void addEvent(String event) {
            this.ToDoList.add(event);
        }

        public void removeEvent(int eventID) {
            this.ToDoList.remove(eventID);
        }

        public void ListOfAllEvents() {
            for (int i = 0; i < this.ToDoList.size(); i++) {
                System.out.println((i + 1) + "- " + this.ToDoList.get(i));
            }

        }
    }

    public static void main(String[] args){

        DailyToDoList ToDoList = new DailyToDoList();
        int indicator = 0;
        while (indicator == 0){

            System.out.println("");
            System.out.println("******* LIST OF THINGS TO DO *******");
            System.out.println("");
            System.out.println("(1) Add an event");
            System.out.println("(2) Remove an event");
            System.out.println("(3) List of all events");
            System.out.println("(4) Exit list");
            System.out.println("");
            System.out.println("Select an option: ");

            Scanner input = new Scanner(System.in);
            int option = input.nextInt(); input.nextLine();

            if(option == 1){
                System.out.println("Enter event information: ");
                String event = input.nextLine();
                ToDoList.addEvent(event);
                System.out.println("An event has been added.");
            }

            else if(option == 2){
                ToDoList.ListOfAllEvents();
                System.out.println("Enter the number of the event to be removed.");
                int number = input.nextInt();
                ToDoList.removeEvent(number-1);
                System.out.println("The event has been removed.");
            }

            else if(option == 3){
                ToDoList.ListOfAllEvents();
            }

            else {indicator = 1;}
        }

    }
}
