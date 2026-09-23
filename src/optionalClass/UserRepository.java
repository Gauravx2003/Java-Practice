package optionalClass;

import javax.swing.text.html.Option;
import java.util.Optional;

public class UserRepository
{
    public Optional<User> findUserById(int id)
    {

        if(id==1) return Optional.of(new User(1, "Gaurav"));

        else return Optional.empty();
    }
}
