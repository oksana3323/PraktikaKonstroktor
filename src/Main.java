import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
 /*  Phone phone=new Phone("Samsung ","s10 ", "full hd");
        System.out.println(phone.getBrand()+phone.getVersion()+phone.getScreen());

   phone.setMemory("128");
   phone.setPrice("20000 som");

        System.out.println(phone.getMemory()+"\n"+phone.getPrice());
        Phone phone1=new Phone("Samsung ","s10 ", "full hd");
        System.out.println(phone.getBrand()+phone.getVersion()+phone.getScreen());
     Phone[] phones={phone1,phone};
        for ( Phone a:phones)
        {
            System.out.println(a.getPrice()+a.getMemory());

        }*/
        Person person = new Person("Aijamal ", 26, "Salon ", 5000 , "0220-14-14-14");

        System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.getWork() + "\n" + person.getSalary() + "\n" +
                "\n" + person.getPhone());


        Person person1 = new Person("Aika ", 25, "Bank ", 50000 , "0220-14-14-14");

        System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.getWork() + "\n" + person.getSalary() + "\n" +
                "\n" + person.getPhone());


        Person person2 = new Person("Kairat ", 19, "  Magazin",60000 , "0220-14-14-14");

        System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.getWork() + "\n" + person.getSalary() + "\n" +
                "\n" + person.getPhone());

        Person person3 = new Person("Keldibeek", 26, "Peaksoft ", 80000 , "0220-14-14-14");

        System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.getWork() + "\n" + person.getSalary() + "\n" +
                "\n" + person.getPhone());


        Person person4 = new Person("Symbat ", 26, "Salon ", 80000 , "0220-14-14-14");

        System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.getWork() + "\n" + person.getSalary() + "\n" +
                "\n" + person.getPhone());

        Person person5 = new Person("Ernazar ", 26, "Peaksoft", 90000 , "0220-14-14-14");

        System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.getWork() + "\n" + person.getSalary() + "\n" +
                "\n" + person.getPhone());

int [] s ={person.getSalary(),person2.getSalary(),person3.getSalary(),person4.getSalary(),person5.getSalary()};
        Arrays.sort(s);
        System.out.println(s[s.length-1]);
        System.out.println(s[0]);

        }


    }
