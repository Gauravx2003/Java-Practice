package optionalClass;

import javax.swing.text.html.Option;
import java.util.Optional;

public class UserRepository
{
    public Optional<User> findUserById(int id)
    {

        //We use Optional.of as the argument ( new User ) never returns null value
        //otherwise we would need to use Option.ofNullable
        if(id==1) return Optional.of(new User(1, "Gaurav"));

        else return Optional.empty();
    }
}
