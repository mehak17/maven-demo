import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoListAssignmentTest {

    /**
     * This is for adding an event in the ToDoList
     */
    @Test
    public void test(){
        ToDoListAssignment assignment = new ToDoListAssignment();
        ToDoListAssignment.DailyToDoList toDo = new ToDoListAssignment.DailyToDoList();
        toDo.addEvent("Sample");
        Assertions.assertTrue(toDo.ToDoList.size()>0);
    }

    /**
     * This is for checking the ToDoList size
     */
    @Test
    public void testSizeOfTodoList(){
        ToDoListAssignment assignment = new ToDoListAssignment();
        ToDoListAssignment.DailyToDoList toDo = new ToDoListAssignment.DailyToDoList();
        toDo.addEvent("Sample");
        toDo.addEvent("Some Event");
        Assertions.assertTrue(toDo.ToDoList.size()==2);
    }

    /**
     * This is for the event item is exist in the ToDoList or not
     */
    @Test
    public void testEventExist(){
        ToDoListAssignment assignment = new ToDoListAssignment();
        ToDoListAssignment.DailyToDoList toDo = new ToDoListAssignment.DailyToDoList();
        toDo.addEvent("Sample");
        toDo.addEvent("Some Event");
        Assertions.assertTrue(toDo.ToDoList.get(1)=="Some Event");
    }

    /**
     * Testing Removing an item from ToDoList and validating with the size of the List.
     *
     */
    @Test
    public void testRemoveEvent(){
        ToDoListAssignment assignment = new ToDoListAssignment();
        ToDoListAssignment.DailyToDoList toDo = new ToDoListAssignment.DailyToDoList();
        toDo.addEvent("Sample");
        toDo.addEvent("Some Event");
        Assertions.assertEquals(true,toDo.ToDoList.size()==2);
        toDo.removeEvent(1);
        Assertions.assertEquals(true,toDo.ToDoList.size()==1);
    }
}
