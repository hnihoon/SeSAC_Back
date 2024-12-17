package test;

 class Cat extends Animal implements Grrable{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void grr() {
        System.out.println("그르르");
    }
    
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
