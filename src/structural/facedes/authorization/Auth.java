package structural.facedes.authorization;

public class Auth implements IAuth{
    @Override
    public void auth(){
        System.out.println("Approved");
    }
}
