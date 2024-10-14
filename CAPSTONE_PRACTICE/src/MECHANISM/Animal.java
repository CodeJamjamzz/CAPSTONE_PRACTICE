package MECHANISM;

public class Animal {
    // Practice to know this is the updated version
    public String name;
    public int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " and i am " + age + " years old";
    }

    // this is for the new branch
    public void talk(){
        System.out.println("Hi i am " + name);
    }

    public int t(){
        return 32323;
    }

    public String sydney(){
        return "Ice cream yummy";
    }

}
