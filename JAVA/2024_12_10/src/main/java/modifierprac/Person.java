package modifierprac;

public class Person {

    private String name = "";
    public int age = 0;
    double height = 0;

    private void Run(){
        System.out.println("run");
    }

    public void Walk(){
        System.out.println("walk");
    }

     void Study(){
        System.out.println("study");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void RunGet(){
        Run();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
