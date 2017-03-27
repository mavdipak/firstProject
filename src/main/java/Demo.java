import org.firstProject.Person;

/**
 * Created by dipakk on 3/27/2017.
 */
public class Demo {
    public static void main(String args[]){

        Person p1 = new Person();
        p1.name = "name doesn't define you";
        p1.email = "it requires to IT guy";
        System.out.println("hi wassup "+p1.email+" "+p1.name);
    }
}
