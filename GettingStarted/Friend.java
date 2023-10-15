public class Friend
{
    String name;
    static int numberOfFriend = 0;
    Friend(String name)
    {
        this.name = name;
        numberOfFriend++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getNumberOfFriend() {
        return numberOfFriend;
    }
    public static void setNumberOfFriend(int numberOfFriend) {
        Friend.numberOfFriend = numberOfFriend;
    }
}
