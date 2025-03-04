package Package2;
import java.util.ArrayList;
import java.util.List;

public class UserItems {
    String Cartype;
    String Biketype;
    String Shoetype;
    int PhoneNumber;

    private static List<UserItems> MyItems = new ArrayList<>();
    //constructor
    UserItems(String Cartype, String Biketype, String Shoetype, int PhoneNumber){
        this.Cartype=Cartype;
        this.Biketype=Biketype;
        this.Shoetype=Shoetype;
        this.PhoneNumber=PhoneNumber;
    }
    //method

    public void displayUserDetails(){
        System.out.println("Cartype is "+Cartype);
        System.out.println("Biketype is "+Biketype);
        System.out.println("Shoetype is "+Shoetype);
        System.out.println("Phone number is "+PhoneNumber);
    }
    public  static void AddMyItems(UserItems Items){
        MyItems.add(Items);
        System.out.println("Items added succefully !");
    }
    public static  void displayitems(){
        if(MyItems.isEmpty()){
            System.out.println("No available items !");
        } else{
            System.out.println("Items available are: ");
            for(UserItems Items: MyItems) {
                System.out.println("-----------------------------");
                Items.displayUserDetails(); //call the method 
            }
        }
    }

}
