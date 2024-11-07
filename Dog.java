import java.util.Scanner;
import java.util.Arrays;

public class Dog{
  private String breed;
  private String size;
  private int age;
  
  public Dog(String breed, String size, int age){
    this.breed = breed;
    this.size = size;
    this.age = age;
  }

  public String getBreed() {
    return breed;
  }

    public String getSize() {
    return size;
  }

    public int getAge() {
    return age;
  }

  public String toString(){
    return "Breed: " + breed + "\nSize: " + size + "\nAge: " + age;
  }
  
}