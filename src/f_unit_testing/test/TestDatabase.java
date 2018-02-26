package f_unit_testing.test;

import f_unit_testing.main.Database;
import org.junit.Assert;
import org.junit.Test;

public class TestDatabase {

    @Test(expected = UnsupportedOperationException.class) // Assert
    public void cantCreateDatabase() {
        Database database = new Database(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
    }

    @Test
    public void createdDatabaseMustBeNull() {
        Database database = null;
        try{
            database = new Database(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
        }catch (Exception ignored){

        }
        Assert.assertEquals(null, database);
    }

    @Test
    public void createEmptyDatabase(){
        Database database = new Database();
        Assert.assertEquals(database.getSize(), 0);
        Assert.assertEquals(database.fetch().length, 0);
    }

    @Test(expected = UnsupportedOperationException.class) // Assert
    public void cantAddToFullDatabase() {
        Database database = new Database(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        database.add(17);
    }

    @Test(expected = UnsupportedOperationException.class) // Assert
    public void cantRemoveFromEmptyDatabase() {
        Database database = new Database();
        Integer item = database.remove();
    }

    @Test
    public void removeMustReturnLastItem(){
        Database database = new Database(1,2,3,4,5);
        int item = database.remove();
        Assert.assertEquals(5, item);
        Assert.assertEquals(4, database.getSize());

    }

    @Test
    public void testFetchMethod(){
        Database database = new Database(1,2,3,4,5);
        int[] array = database.fetch();

        Assert.assertEquals(database.getSize(), array.length);
        Assert.assertEquals(1, array[0]);
        Assert.assertEquals(2, array[1]);
        Assert.assertEquals(3, array[2]);
        Assert.assertEquals(4, array[3]);
        Assert.assertEquals(5, array[4]);

    }



}
