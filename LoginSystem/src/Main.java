import java.util.Scanner;

public class Main {

    /* Creating an array of classes fixed to the size of 4
        That way it's easier to reference.
        Ideally this would be in its own class that would be pulled from.
     */
    private static User[] nameArray = new User[4];

    public static void main(String[] args) {

        CreateSampleLogins();

        System.out.print("""
                
                [SYSTEM] - Welcome to the Scientist/Engineer database.
                
                    1. Login
                    2. Signup
                    x. Exit
                    
                """);

        Scanner selected =  new Scanner(System.in);
        System.out.print("Option: ");
        String option = selected.nextLine();

        // switch case for login system
        switch (option){
            case "1":
                SendToLogin();
                break;
            case "2":
                SendToSignUp();
                break;
            case "x":
                System.out.println("\n[SYSTEM] - Until next time, fellow brainiac. ");
                break;
            default:
                System.out.println("\n[ERROR] - Invalid option. ");
        }

    }

    public static boolean CheckForBlankInput(String input){
        if(input.isBlank()) return false;
        return true;
    }

    // Login System
    public static void SendToLogin(){
        System.out.println("\n[PROCESS] - Loading login...");
        System.out.println("\n[SECURITY] - Attempts: 1");   // this would be an actual variable, for now it's just a string.

        // scanning
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String usernameInput = input.nextLine();

        /* while looping the result of usernameInput, if it's false then allow the user to re-enter a username
            If it's true, then continue.
         */
        while (!CheckForBlankInput(usernameInput)){
            System.out.print("[ERROR] - Username is required in order to proceed. Re-enter: ");
            usernameInput = input.nextLine();
        }

        System.out.print("Enter password: ");
        String passwordInput = input.nextLine();

        boolean hasFoundMatch = false;  // this boolean is used to check if the passing is valid

        for(int i = 0; i < nameArray.length; i++){

            // .tolowerCase converts both retrieved strings from the class and user inputs to lowercase, which prevents case sensitivity
            if(nameArray[i].getUsername().toLowerCase().equals(usernameInput.toLowerCase()) && nameArray[i].getPassword().equals(passwordInput)){
                hasFoundMatch = true;   // switches to true when a match is found
                User user = nameArray[i];   // creates a class that will reference the matching username in the database.
                System.out.println("\n[SYSTEM] - Welcome, "+ user.getUsername() + ".");
                System.out.printf("""
                        
                        -------- Profile -------- >
                        
                            Name: %s
                            User ID: %d
                            bio: %s
                            Account privileges: %s
                            Prototype: %s
                        
                        ------------------------- >
                        
                        """, user.getName(), user.getID(), user.getBio(), user.getType(), user.getPrototypes());
                break;
            }

        }
        // if the boolean still reads false, it will send this "error", message
        if(!hasFoundMatch){
            System.out.println("[ERROR] - Invalid username or password. Max attempts reached.");
        }

    }

    // Sign Up system
    public static void SendToSignUp(){
        System.out.println("\n[SYSTEM] - Work in progress (maybe).");
    }


    // Sample logins
    /*
        Ideally this would be in its own class that would be pulled from to prevent clutter within the main class.
        But due to time, it will all be done here.

     */
    public static void CreateSampleLogins(){
        User eggMan = new User("EggMan", "Ivo", "a1B2c3D4", (short) 1, (byte)1);
        eggMan.bio = """
                
                 As the true ruler of Eggman Empire, I shall soon bring an end to all who dare oppose me.
                    My scientific expertise, unparalleled strategic mind, and mechanical marvels will ensure
                    the future is mine, and mine alone!
                    Bow before my intellect, for I am the Eggman, and the world is my playground.
                    
                    Now, prepare for your inevitable defeat... HAHAHAHAHA!
                
                """;

        User eggManNega = new User("Eggman-Nega", "Ivo (future)", "e5F6g7H8", (short) 2, (byte)1);
        eggManNega.bio = """
                In my future, I do not simply control the world—I own it. I have bent time, space, and reality to my will.
                    The Sonic the Hedgehogs of this world? Mere footnotes in the story of my unchallenged dominance.
                    The petty rebellions and minor obstacles that once plagued me? Gone. I have achieved ultimate power,
                    wielding technology that transcends time itself.
                
                """;

        User gerald = new User("Gerald173", "Gerald","i9J0k1l2", (short) 3, (byte)1);
        gerald.bio = """
                My son, Professor Ivo "Eggman" Robotnik, so full of potential, and yet so blinded by his own
                    ego, could never see the grandeur of my vision. I entrusted him with my research, my legacy,
                    hoping he would rise above the mundane and embrace the higher calling of science and progress.
                    Instead, he squandered it all in a vain pursuit of petty power, his mind consumed by childish
                    ambition.
                
                    But it was not for him that I created Shadow the Hedgehog. No, Shadow was my crowning
                    achievement, the ultimate being, born of my desire to not just change the world, but to
                    save it. It was my misguided hope that the world could be shaped by such a creation, one with
                    the potential to heal the damage done by humanity’s own hand.
                
                """;

        // Demonstrating an example of different constructor usage
        User tails = new User("TwinTails", "Miles Tails Prower", "8", (short) 4, (byte)0, "I am Miles \"Tails\" Prower, a skilled inventor and engineer with a passion for problem-solving. With my intellect and ability to fly using my two tails, I am dedicated to using my talents to support my friends and protect the world from any threat that may arise.");

        // adding user classes to name array
        nameArray[0] = eggMan;
        nameArray[1] = eggManNega;
        nameArray[2] = gerald;
        nameArray[3] = tails;


    }


}