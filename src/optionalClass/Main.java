package optionalClass;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();


        //We get an Option<User> return value instead of User
        Optional<User> user = repo.findUserById(2);


        //Nullpointer Exception is gracefully handled
        if(user.isPresent()){
            User user1 = user.get();
            System.out.println(user1.getName());
        }else{
            System.out.println("User not found");
        }
    }
}