public class Driver {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new Facebook("Luffy", "LuffyTaro");
        socialNetwork.post("I'm gonna become the King of the Pirates");

        socialNetwork = new Twitter("Madara", "Tsukuyomi");
        socialNetwork.post("I Madara declare you the strongest");
    }
}