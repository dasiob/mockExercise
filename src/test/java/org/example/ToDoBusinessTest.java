package org.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ToDoBusinessTest {

    @Test
    public void checklist() {
        ToDoService tds = mock(ToDoService.class);
        List<String> examples = Arrays.asList("Lmao Spring", "Java Spring", "Bruh bruh");
        when(tds.getTodos("user")).thenReturn(examples);

        ToDoBusiness tdb = new ToDoBusiness(tds);
        int a = tdb.listhaveSpring("user").size();

        Assert.assertEquals(2, a);
    }

}