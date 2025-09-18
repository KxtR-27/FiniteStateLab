package lab;

public class Main {
    public static void main(String[] args) {
        Node start = new Node("""
                It's a breezy, dark night. You stroll home along the busy city sidewalk.
                Suddenly, you notice a small cat loo king at you from a nearby alley.
                """, false);

        Node keepWalking = new Node("""
                You decide to continue the walk home. Stray cats are a sad sight,
                but there's not much you can do to fix that. The end.
                """, true);

        Node watchFromADistance = new Node("""
                You gaze at the cat from afar. It doesn't seem to move.
                It just keeps looking your way.
                """, false);

        Node approach = new Node("""
                As you approach the small creature, you inspect it for a closer look.
                The cat is young, but not a kitten. He has an orange tabby coat with ear
                fluff loosely resembling that of a Maine Coon. You see a glimmer in his eyes.
                He appears to be beckoning you.
                """, false);

        Node changeYourMind = new Node("""
                While an adventure seems all fun and good, it's late. You don't know this cat.
                "He'll be alright without me," you tell yourself. You turn around and walk back
                the way you came, wondering what the cat might have led you to.
                """, true);

        Node followHim = new Node("""
                He lets out a gentle meow, then turns tail and trots off at a brisk pace.
                You follow the cat. He seems pleased as you follow, periodically making a small
                gurgling noise, like some cats do.
                """, false);

        Node continueToFollow = new Node("""
                The cat leads you through a few turns along the neverending concrete. Eventually, the two of
                you arrive at a lit window with sounds of cooking coming from inside. The window
                appears to be too high up for the cat to reach by himself.
                
                The cat meows at you, waits for you to make eye contact, and waves his paw
                toward the window. Then, you turn your attention to the window and notice that
                the window is slightly ajar. It looks like this little guy got out and couldn't
                get back in.
                
                With an amused sigh, you reach down and grasp the cat gently but firmly under his
                shoulders. You grunt a little as you lift him--he's a bit heftier than he looks.
                He lets out another gurgle as you hoist him toward the window. When he's close enough,
                he hops from your hands onto the window before quickly hopping down into the apartment
                and scurrying to the kitchen, which is out of view. You linger for a few moments.
                The miscellaneous cooking sounds continue. As you turn to leave and head back home,
                you hear a gasp.
                
                "Calvin??????? No way, I thought I lost you buddy! Haha!"
                The voice from the kitchen continues to celebrate as you depart. You chuckle to
                yourself a little. With a small grin on your face, you walk home to retell the
                story to your roommate. The end.
                """, true);


        start.addChoice("Watch the cat", watchFromADistance);
        start.addChoice("Keep walking", keepWalking);

        watchFromADistance.addChoice("Keep watching", watchFromADistance);
        watchFromADistance.addChoice("Approach the cat", approach);
        watchFromADistance.addChoice("Continue your walk", keepWalking);

        approach.addChoice("Change your mind", changeYourMind);
        approach.addChoice("Follow him", followHim);

        followHim.addChoice("Change your mind", changeYourMind);
        followHim.addChoice("Continue following", continueToFollow);


        Game game = new Game(start);
        game.playGame();


        System.exit(0);
    }
}
