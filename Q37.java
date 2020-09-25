class Person{
    private int age;
    private String name;

    Person(String name,int age){
      this.name=name;
      this.age=18;
    }

    void display(){
        System.out.println(name+" "+age);
    }
}

class PersonDemo{
    public static void main(String args[]) {
        Person p=new Person("pravin",20);
        p.display();
    }
}