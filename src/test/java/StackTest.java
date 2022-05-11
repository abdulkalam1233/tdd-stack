import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private MyStack myStack;

    @BeforeEach
    void init() {
        myStack = new MyStack(2);
    }

    @Test
    void stack_should_be_empty() {
        assertTrue(myStack.isEmpty());
    }

    @Test
    void should_push_the_element_into_the_stack() {
        myStack.push(1);

        assertFalse(myStack.isEmpty());
    }

    @Test
    void after_one_push_one_pop_is_empty() {
        myStack.push(1);
        myStack.pop();

        assertTrue(myStack.isEmpty());
        assertEquals(0, myStack.getSize());
    }

    @Test
    void after_two_push_the_size_should_be_two() {
        myStack.push(1);
        myStack.push(2);

        assertEquals(2, myStack.getSize());
    }

    @Test
    void popping_empty_stack_should_throw_exception() {
        assertThrows(MyStack.UnderFlowException.class, () -> myStack.pop());
    }

    @Test
    void after_push_x_should_pop_x() {
        myStack.push(100);
        assertEquals(100, myStack.pop());

        myStack.push(99);
        assertEquals(99, myStack.pop());
    }

    @Test
    void after_push_x_y_pop_should_return_y_then_x() {
        myStack.push(1);
        myStack.push(2);

        assertEquals(2, myStack.pop());
        assertEquals(1, myStack.pop());
    }

    @Test
    void should_throw_overflow_exception() {
        myStack.push(1);
        myStack.push(2);
        assertThrows(MyStack.OverFlowException.class, () -> myStack.push(3));
    }
}
