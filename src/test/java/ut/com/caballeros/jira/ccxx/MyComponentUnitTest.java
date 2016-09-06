package ut.com.caballeros.jira.ccxx;

import org.junit.Test;
import com.caballeros.jira.ccxx.api.MyPluginComponent;
import com.caballeros.jira.ccxx.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}