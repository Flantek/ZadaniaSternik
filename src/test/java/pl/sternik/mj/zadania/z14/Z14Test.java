package pl.sternik.mj.zadania.z14;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class Z14Test {


    UserService userService = mock(UserService.class);
    AuthService authService = new AuthService(userService);

    @Test
    public void testBadLogin() {
        when(userService.findByName("xyz")).thenReturn(null);

        boolean authOk = authService.checkCredentials("xyz", "password");

        assertThat(authOk).isFalse();
        verify(userService).findByName("xyz");
    }
}