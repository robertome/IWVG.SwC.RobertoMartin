package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(22, "Alex Puebla", "holguin");
    }

    @Test
    void testUserWithNameNull() {
        assertThrows(IllegalArgumentException.class, () -> new User(23, null, "smith"));
    }

    @Test
    void testUserWithFamilyNameEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new User(23, "Alex", ""));
    }

    @Test
    void testUserIntStringString() {
        assertEquals(22, user.getNumber());
        assertEquals("Alex puebla", user.getName());
        assertEquals("Holguin", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Alex puebla Holguin", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("A.", user.initials());

    }
}