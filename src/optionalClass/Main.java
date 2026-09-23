package optionalClass;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        Optional<User> user = repo.findUserById(2);

        if(user.isPresent()){
            User user1 = user.get();
            System.out.println(user1.getName());
        }else{
            System.out.println("User not found");
        }
    }
}