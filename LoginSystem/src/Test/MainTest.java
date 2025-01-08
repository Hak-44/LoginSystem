import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    /*
     This is checking if the method return false when the user input is passed through to check for blank spaces.
     */
    @Test
    void BlankOrEmptyUsernameInputReturnFalse(){
        String username = "";   // the scanner in Main handles strings
        assertFalse(Main.CheckForBlankInput(username));
    }

    // opposite of the above
    @Test
    void FilledUsernameInputReturnTrue(){
        String username = "test";
        assertTrue(Main.CheckForBlankInput(username));

    }

    // this was to test this particular assertion, to display all errors at once, stated in the user-guide
    @Test
    void CheckingBothInvalidAndValidUsernameInputs(){

        String userName1 = "";
        String userName2 = "Pickle";

        assertAll("usernameInput",
                () -> assertFalse(Main.CheckForBlankInput(userName1)),
                () -> assertTrue(Main.CheckForBlankInput(userName2))
        );
    }





}