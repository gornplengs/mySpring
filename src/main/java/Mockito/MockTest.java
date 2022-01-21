package Mockito;

import org.mockito.MockitoAnnotations;

/**
 * @author yhe
 * @date 2021/12/28
 */
public class MockTest {


    public static void main(String[] args) {
        MyList myList = new MyList();
        MockitoAnnotations.initMocks(myList);

        myList.run();
    }
}
