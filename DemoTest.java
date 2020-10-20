import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import jdk.internal.jline.internal.TestAccessible;
import sun.security.provider.ByteArrayAccess;

public class DemoTest {
    @Test
    public void test_is_triangle_1()
    {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void test_is_triangle_2()
    {
        assertTrue(Demo.isTriangle(5, 12, 13));
    }

    @Test
    public void test_is_triangle_3()
    {
        assertTrue(Demo.isTriangle(5, 13, 12));
    }

    @Test
    public void test_is_triangle_4()
    {
        assertTrue(Demo.isTriangle(12, 5, 13));
    }
    
    @Test
    public void test_is_Not_triangle_1()
    {
        assertFalse(Demo.isTriangle(5, 7, 13));
    }

    @Test
    public void test_is_Not_triangle_2()
    {
        assertFalse(Demo.isTriangle(5, 13, 7));
    }

    @Test
    public void test_is_Not_triangle_3()
    {
        assertFalse(Demo.isTriangle(13, 5, 7));
    }

    @Test
    public void test_is_Not_triangle_4()
    {
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void test_is_Not_triangle_5()
    {
        assertFalse(Demo.isTriangle(5, 9, 3));
    }

    @Test
    public void test_is_Not_triangle_6()
    {
        assertFalse(Demo.isTriangle(1, 2, -1));
    }

    @Test
    public void test_main_program_1()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("!\n12\n13\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String consoleOutputString = "Enter side 1: \n";
        consoleOutputString += "Enter Side 2: \n";
        consoleOutputString += "Enter side 3: \n";
        consoleOutputString += "This is triangle. \n";
        
        assertEquals(consoleOutputString, out.toString());
    }
}