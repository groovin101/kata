package com.groovin101.kata;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;
import org.mockito.ArgumentMatcher;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Class to show us how the heck to use this Mockito thing.
 * <p/>
 * These examples were stolen verbatim from: http://gojko.net/2009/10/23/mockito-in-six-easy-examples/
 */
public class MockitoTest {

    //This is just me showing that you can easily mock a class, get it to behave a certain way on method call, and that
    //you can also verify that a method x was indeed called.
    @Test
    public void heyDummy() {
        ArrayList mockedList = mock(ArrayList.class);
        when(mockedList.get(0)).thenReturn("first val");
        assertEquals("first val", mockedList.get(0));
        verify(mockedList).get(anyInt());
    }

    //To create a stub (or a mock), use mock(class). Then use when(mock).thenReturn(value) to specify the stub value for a
    // method. If you specify more than one value, they will be returned in sequence until the last one is used, after which
    // point the last specified value gets returned. (So to have a method return the same value always, just specify it once).
    // For example:
    @Test
    public void iterator_will_return_hello_world() {
        //arrange
        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn("Hello").thenReturn("World");
        //act
        String result = i.next() + " " + i.next();
        //assert
        assertEquals("Hello World", result);
    }

    //This example creates a mock iterator and makes it return 'Hello' the first time method next() is called. Calls
    // after that return 'World'. Then we can run normal assertions.
    //
    // Stubs can also return different values depending on arguments passed into the method. For example:
    @Test
    public void with_arguments() {
        Comparable c = mock(Comparable.class);
        when(c.compareTo("Test")).thenReturn(1);
        assertEquals(1, c.compareTo("Test"));
    }

    //This creates a stub Comparable object and returns 1 if it is compared to a particular String value ('Test' in this
    // case). If the method has arguments but you really don’t care what gets passed or cannot predict it, use anyInt()
    // (and alternative values for other types). For example:
    @Test
    public void with_unspecified_arguments() {
        Comparable c = mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        assertEquals(-1, c.compareTo(5));
    }

    //This stub comparable returns -1 regardless of the actual method argument. With void methods, this gets a bit tricky
    // as you can’t use them in the when() call. The alternative syntax is doReturn(result).when(mock_object).void_method_call();
    // Instead of returning, you can also use .thenThrow() or doThrow() for void methods. For example:
    @Test(expected = IOException.class)
    public void outputStreamWriter_rethrows_an_exception_from_OutputStream()
            throws IOException {
        OutputStream mock = mock(OutputStream.class);
        OutputStreamWriter osw = new OutputStreamWriter(mock);
        doThrow(new IOException()).when(mock).close();
        osw.close();
    }

    //This example throws an IOException when the mock OutputStream close method is called. We verify easily that the
    // OutputStreamWriter rethrows the exception of the wrapped output stream. To verify actual calls to underlying
    // objects (typical mock object usage), we can use verify(mock_object).method_call; For example:
    @Test
    public void outputStreamWriter_Closes_OutputStream_on_Close()
            throws IOException {
        OutputStream mock = mock(OutputStream.class);
        OutputStreamWriter osw = new OutputStreamWriter(mock);
        osw.close();
        verify(mock).close();
    }

    // *****************************************************************************************************************
    // DO NOT REMOVE THE HOW TO EXAMPLES BELOW
    // *****************************************************************************************************************

    //HOW TO - check object calls itself
    /**
     * Test that the permission manager calls the appropriate method ON ITSELF for each document type; must use a spy instead of a mock
     */
//    @Test
//    public void testCanUserAddDoc_supportDoc() {
//
//        FaiPermissionManager permissionManagerAsSpy = Mockito.spy(faiPermissionManager);
//        permissionManagerAsSpy.canUserAddDoc(FaiDocumentType.SUPPORT);
//        verify(permissionManagerAsSpy).isCanUserAddSupportDoc();  //*** NOTE the placement of the verify method parenthesis - major tripping point
//    }


    //HOW TO - tell a method to return the same argument that it was passed - use an Answer object and inspect the method invocation itself to grab the arg(s)
//    @Test
//    public void testCancelTask_leavesTaskInCancelledState() throws InsufficientPrivilegesException {
//
//        FaiTask faiTaskThatStartedOpen = TestUtil.buildTestFaiTask("a", "b");
//        faiTaskThatStartedOpen.setTaskStatus(TaskStatus.OPEN);
//
//        FaiTaskService faiTaskServiceMock = mock(FaiTaskServiceImpl.class);
//        when(faiTaskServiceMock.find(1)).thenReturn(faiTaskThatStartedOpen);
//
//        //this gives us the task as we passed it but w/o the mods the service made - no good - need to return the arg that was passed to ensure the arg was modded before it was handed off to the service for saving
//        //when(faiTaskServiceMock.cancelTask(faiTaskThatStartedOpen)).thenReturn(faiTaskThatStartedOpen);
//        when(faiTaskServiceMock.cancelTask(Matchers.<FaiTask>any())).thenAnswer(
//                new Answer<Object>() {
//                    @Override
//                    public Object answer(InvocationOnMock invocation) throws Throwable {
//                        return invocation.getArguments()[0]; //tell it return the same argument that was passed to the service method cancelTask(myTask)
//                    }
//                }
//        );
//
//        faiBh.setFaiTaskService(faiTaskServiceMock);
//        faiBh.setDbUtil(buildMockDbUtil(TestUtil.buildTestFaiTask("owner", "assignee")));
//
//        FaiTask task = faiBh.cancelTask(1);
//
//        assertEquals("Task should be cancelled", TaskStatus.CANCELLED, task.getTaskStatus());
//    }


}