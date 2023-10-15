public class staticmod {
    public static void main(String[] args)
    {
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("patrick");
        Friend friend3 = new Friend("squidward");
        //static modifier keyword creates a single copy of a variable/ method 
        System.out.println(Friend.numberOfFriend);
        System.out.println(Friend.numberOfFriend);
        

    }

}

