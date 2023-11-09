public class Animal {
    String name;
    
    Animal(String name){
        this.name = name;
    }
    
    void eat(){
        System.out.println(name  +" is eating");
    }
    
    void sleep(){
        System.out.println(name + " is sleeping");
    }
    
}
