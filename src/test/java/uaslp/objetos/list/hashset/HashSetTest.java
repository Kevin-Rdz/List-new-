package uaslp.objetos.list.hashset;

import uaslp.objetos.list.Iterator;
import org.junit.jupiter.api.Assertions;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.exception.NotValidIndexException;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import org.junit.jupiter.api.Test;

public class HashSetTest {

    @Test
    public void givenAHashSetSearchAnOnelement_NotExistsInTheHashSet() throws NotValidIndexException {
        //Given
        HashSet<String> list = new HashSet<>();

        //When
        boolean exist = list.contains("Uno");

        //Then
        Assertions.assertFalse(exist);
    }

    @Test
    public void givenAHashSetwith5elements_whenAddAnotherElement_afterSizeIsSix() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> list = new HashSet<>();
        list.add("Dueña");
        list.add("De");
        list.add("Todo");
        list.add("Lo");
        list.add("Perverso");

        //When
        list.add("Addison");

        //Then
        int size = list.size();
        Assertions.assertEquals(6, size);
    }

    @Test
    public void givenAHashSet_whenAddAnElement_thenItIsExistsInTheHashSet() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> list = new HashSet<>();

        //When
        list.add("Titan");

        //Then
        boolean exist = list.contains("Titan");
        Assertions.assertTrue(exist);
    }

    @Test
    public void givenAHashSetWithOneElement_whenRemoveOneElement_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> list = new HashSet<>();
        list.add("Bob");

        //When
        list.remove("Bob");

        //Then
        int size = list.size();
        Assertions.assertEquals(0,size);
    }

    @Test
    public void givenAHashSetOneElement_whenHN_thenItIsTrue() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> list = new HashSet<>();
        list.add("Bob");

        //When
        Iterator<String> iterator = list.iterator();
        boolean exist = iterator.hasNext();

        //Then
        Assertions.assertTrue(exist);
    }

    @Test
    public void givenAHashSetWith2Elements_whenGenerateAIterator_thenGoToTheSecondElement() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> list = new HashSet<>();
        list.add("Bob");
        list.add("Esponja");

        //When
        Iterator<String> iterator = list.iterator();

        //Then
        String message = iterator.next();
        Assertions.assertEquals("Esponja",message);
    }

    @Test
    public void givenANewHashSet_whenNext_thenNotSuchElementException() throws NotSuchElementException {
        //Given
        HashSet<String> list = new HashSet<>();
        Iterator<String> iterator = list.iterator();

        //When
        //Then
        Assertions.assertThrows(NotSuchElementException.class, iterator::next);
    }
    @Test
    public void givenANewHashSetWith100Elements_whenAddAnotherElement_thenSizeIsOneHundredOne() throws NotValidIndexException, NotNullValuesAllowedException {
        // Given:
        HashSet<String> list = new HashSet<>();
        int s;

        for(s = 0; s < 100; s++) {
            list.add("Index: " + s);
        }

        // When:
        list.add("Hello");


        // Then:
        int size = list.size();

        Assertions.assertEquals(101, size);
    }

}