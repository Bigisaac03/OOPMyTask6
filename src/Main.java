import Package1.UserDetails;
import Package2.UserItems;
public class Main {
    public static void main(String[] args) {
        UserDetails User=new UserDetails("Big isaac",55677,2003);
        User.displayUserDetails();

        UserItems itm= new UserItems("RoyceRoss","Honda","jordan1",07);
        UserItems.AddMyItems(itm);
        itm.displayitems();

    }
}