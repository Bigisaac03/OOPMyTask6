package Package2;
import java.util.ArrayList;
import java.util.List;

public class UserItems {
    String Cartype;
    String Biketype;
    String Shoetype;
    int PhoneNumber;

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
    
}
