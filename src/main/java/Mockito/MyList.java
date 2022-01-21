package Mockito;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

/**
 * @author yhe
 * @date 2021/12/28
 */
public class MyList {

    @Mock
    List mockedList;

    public MyList() {

    }

    public void run() {
        Map map = mock(Map.class, new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {

                return invocation.getArgument(0).toString();
            }
        });

        System.out.println(map.get("map"));
        // MockitoAnnotations.initMocks(this);
        when(mockedList.get(0)).thenReturn("one","two");
        when(mockedList.get(1)).thenThrow(new RuntimeException());
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(0));

        List serializableMock = mock(List.class, withSettings().serializable());
        System.out.println(serializableMock);
        // verifyNoMoreInteractions(mockedList);
        System.out.println("------------------------------");
    }
}
