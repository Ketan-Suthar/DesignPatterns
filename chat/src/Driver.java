public class Driver {
    public static void main(String[] args) {
        IChatMediator strawHats = new ChatMediatorImpl();

        IUser luffy = new User("Luffy", strawHats);
        IUser zoro = new User("Zoro", strawHats);
        IUser sanji = new User("Sanji", strawHats);

        strawHats.addUser(luffy);
        strawHats.addUser(zoro);
        strawHats.addUser(sanji);

        IChatMediator marines = new ChatMediatorImpl();

        IUser garp = new User("Garp", marines);
        IUser sengoku = new User("Sengoku", marines);
        IUser akainu = new User("Akainu", marines);
        IUser kizaru = new User("Kizaru", marines);
        IUser aokiji = new User("Aokiji", marines);

        marines.addUser(garp);
        marines.addUser(sengoku);
        marines.addUser(akainu);
        marines.addUser(kizaru);
        marines.addUser(aokiji);

        akainu.sendMessage("Kill Ace");

        luffy.sendMessage("I'm gonna become king of the pirates");
    }
}