package org.example.loginfx;

public class AllAcounts {

    public static User[] nameArray = new User[4];

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
