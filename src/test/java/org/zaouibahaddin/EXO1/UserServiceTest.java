package org.zaouibahaddin.EXO1;

import org.zaouibahaddin.EXO1.User;
import org.zaouibahaddin.EXO1.UserRepository;
import org.zaouibahaddin.EXO1.UserService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testGetUserById() {
        UserRepository mockRepository = mock(UserRepository.class);
        User user_test = new User(1, "John Doe");
        when(mockRepository.findUserById(1)).thenReturn(user_test);
        UserService userService = new UserService(mockRepository);
        User retrievedUser = userService.getUserById(1);
        verify(mockRepository).findUserById(1);
    }
}