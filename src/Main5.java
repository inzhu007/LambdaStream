import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

class Person{
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class PersonFilter{
     List<Person> filterPersons(List<Person> persons){
        return  persons.stream().filter(x->x.getAge()>18).filter(x-> x.getCity().equals("Almaty")).collect(Collectors.toList());
    }
}

public class Main5 {
    public static void main(String[] args) {
        Person p1=new Person("Inzhu" , 17, "Almaty");
        Person p2=new Person("Aidos" , 18, "Kostanay");
        Person p3=new Person ("Zhuldyz" , 20, "Almaty");
        Person p4=new Person("Aibar" , 19, "Astana");
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        PersonFilter filter = new PersonFilter();
        List<Person> fp=filter.filterPersons(people);
        for(Person x: fp ){
            System.out.println(x.getAge() + " " + x.getName() + " " + x.getCity());
        }
    }
}
