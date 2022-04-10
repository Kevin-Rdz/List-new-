package uaslp.objetos.list.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;
import uaslp.objetos.list.linkedlist.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest{

    @Test
    public void givenNewList_whenGetSize_thenResultIsZero () {
        // Given:
        ArrayList<String> list = new ArrayList<>();
        // When:
        int sizeofArray = list.getSize();
        // Then:
        Assertions.assertEquals(0, sizeofArray, "Size of list after creation must be zero");
    }
    @Test
    public void givenANewListWhenAddAtTailAnElement_thenSizeIsTwo () throws NotNullValuesAllowedException, NotValidIndexException {
        // Given
        ArrayList<String> list = new ArrayList<>();
        list.addAtTail("Hola");
        // When
        list.addAtTail("Mundo");
        // Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }
    @Test
    public void givenAArrayListWith2Element_whenSetAt_thenElementIsModified () throws NotValidIndexException, NotNullValuesAllowedException {
        // Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");

        // When:
        list.setAt(0,"Hola");
        // Then:
        int size = list.getSize();
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));

    }

    @Test
    public void givenANewArrayList_whenAddAtTailIsFull_thenIncreaseArraySize () throws NotNullValuesAllowedException {
        ArrayList<String> list = new ArrayList<>(2);
        list.addAtFront("hola");
        list.addAtFront("mundo");

        list.addAtTail("cruel");
        int sizeofArray = list.getSize();

        Assertions.assertEquals(3, sizeofArray, "se espera un tamaño de 3");
        Assertions.assertEquals(list.getAt(0), "mundo");
        Assertions.assertEquals(list.getAt(1), "hola");
        Assertions.assertEquals(list.getAt(2), "cruel");
    }
    @Test
    public void givenANewArrayList_whenAddAtfrontIsFull_thenIncreaseArraySize () throws NotNullValuesAllowedException {
        ArrayList<String> list = new ArrayList<>(2);
        list.addAtFront("hola");
        list.addAtFront("mundo");

        list.addAtFront("cruel");
        int sizeofArray = list.getSize();

        Assertions.assertEquals(3, sizeofArray, "se espera un tamaño de 3");
        Assertions.assertEquals(list.getAt(0), "cruel");
        Assertions.assertEquals(list.getAt(1), "mundo");
        Assertions.assertEquals(list.getAt(2), "hola");
    }

    @Test
    public void givenAListWith3Element_whenGetIterator_thenIteratorWorksOverAllThreeElements () throws NotValidIndexException, NotNullValuesAllowedException {
        // Given:
        ArrayList<String> list = new ArrayList<>();


        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        // When:
        Iterator<String> iterator = list.getIterator();
        // Then:
        int size = list.getSize();
        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
    @Test
    public void givenAListWith2Element_whenSetAt_thenElementIsModified () throws NotValidIndexException, NotNullValuesAllowedException {
        // Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");

        // When:
        list.setAt(0,"Hola");
        // Then:
        int size = list.getSize();
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));

    }
    @Test
    public void givenAListWith3Element_whenRemoveElementAtTail_thenSizeIsTwo () throws NotValidIndexException, NotNullValuesAllowedException {
        // Given:
        ArrayList<String> list = new ArrayList<>();


        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        // When:
        list.remove(2);
        // Then:
        int size = list.getSize();
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }
    @Test
    public void givenAListWith3Element_whenRemoveElementAll_thenSizeIsTwo () throws NotValidIndexException, NotNullValuesAllowedException {
        // Given:
        ArrayList<String> list = new ArrayList<>();


        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        // When:
        list.removeAll();
        // Then:
        int size = list.getSize();
        Assertions.assertEquals(0, size);

    }
}