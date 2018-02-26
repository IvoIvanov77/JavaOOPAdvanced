package f_unit_testing.test;

import f_unit_testing.main.ListIterator;
import org.junit.Assert;
import org.junit.Test;

public class TestListIterator {

    @Test(expected = UnsupportedOperationException.class) // Assert
    public void testConstructorWithNullValue() {
        ListIterator iterator = new ListIterator(null);
    }

    @Test(expected = UnsupportedOperationException.class) // Assert
    public void testPrintWithEmptyIterator() {
        ListIterator iterator = new ListIterator();
        String result = iterator.print();
    }

    @Test
    public void testMoveOperation(){
        ListIterator iterator = new ListIterator("Ivo", "Pesho", "Gosho");

        Assert.assertEquals("Ivo", iterator.print());
        Assert.assertTrue(iterator.move());
        Assert.assertEquals("Pesho", iterator.print());
        Assert.assertTrue(iterator.move());
        Assert.assertEquals("Gosho", iterator.print());
        Assert.assertTrue(iterator.move());
        Assert.assertFalse(iterator.move());
    }

    @Test
    public void testHasNext(){
        ListIterator iterator = new ListIterator("Ivo", "Pesho", "Gosho");
        Assert.assertEquals("Ivo", iterator.print());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertTrue(iterator.move());
        Assert.assertEquals("Pesho", iterator.print());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertTrue(iterator.move());
        Assert.assertEquals("Gosho", iterator.print());
        Assert.assertTrue("Must be true",iterator.hasNext());
        Assert.assertTrue(iterator.move());
        Assert.assertFalse("Must be false",iterator.hasNext());
    }

    @Test
    public void testIterator(){
        ListIterator iterator = new ListIterator("Ivo", "Pesho", "Gosho");
        String[] expected = {"Ivo", "Pesho", "Gosho"};
        String[] array = new String[3];
        int index = 0;
        while (iterator.hasNext()){
            array[index] = iterator.print();
            iterator.move();
            index++;
        }

        Assert.assertArrayEquals("Wrong output",expected , array);



    }





}
