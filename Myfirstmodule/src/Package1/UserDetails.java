package Package1;

public class UserDetails {
    //declaring variables
    String UserName;
    int ID;
    int password;
    //constructor
    public UserDetails(String UserName, int ID, int password){
        this.UserName=UserName;
        this.ID=ID;
        this.password=password;
    }
    String GetUserName(){
        return UserName;
    }
    int GetID(){
        return ID;
    }
    int Getpassword(){
        return password;
    }
    public void displayUserDetails(){
        System.out.println("User name is "+UserName);
        System.out.println("User ID is "+ID);
        System.out.println("User password is "+password);
    }
}
