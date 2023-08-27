
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;




public class ExerciseManagementTest {
    
    private ExerciseManagement man;
    
    @Before
    public void initialize() {
        
        man = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        
        assertEquals(0, man.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne(){
        
        man.add("Write a test");
        assertEquals(1, man.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList(){
        
        man.add("Write a test");
        assertTrue(man.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        
        man.add("New exercise");
        man.markAsCompleted("New exercise");
        assertTrue(man.isCompleted("New exercise"));
        
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        
        man.add("New exercise");
        man.markAsCompleted("New exercise");
        assertFalse(man.isCompleted("Some exercise"));
    }
}
