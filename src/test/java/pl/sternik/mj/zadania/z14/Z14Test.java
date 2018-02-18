package pl.sternik.mj.zadania.z14;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class Z14Test {


    UserService userService = mock(UserService.class);
    AuthService authService = new AuthService(userService);

    @Test(expected = NullPointerException.class)
    public void testBadLogin() {
        when(userService.findByName("xyz")).thenReturn(null);
        // when(userService.findByName("xyz")).thenThrow(NullPointerException.class);
        when(userService.findByName(anyString())).thenThrow(NullPointerException.class);

        boolean authOk = authService.checkCredentials("xyz", "password");

        assertThat(authOk).isFalse();
        verify(userService).findByName("xyz");
        verify(userService, never()).findByName("root");
        verify(userService, atMost(1)).findByName("xyz");
        verify(userService, times(1)).findByName("xyz");

    }
}