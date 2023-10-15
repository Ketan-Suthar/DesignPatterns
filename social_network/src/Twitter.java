public class Twitter extends SocialNetwork {
    public Twitter(final String userName, final String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(final String userName, final String password) {
        System.out.println("\nLogin...");
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }

        System.out.println("\nLogIn success on Twitter");
        return true;
    }

    public boolean sendData(final byte[] data) {
        System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
        return true;
    }

    public void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Twitter");
    }
}
