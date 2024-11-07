import java.util.Scanner;
import java.util.Arrays;


public class UserStory {
  private Dog[] dogs;

  public UserStory(String breedsFile, String sizeFile, String ageFile){
    dogs = createDog(breedsFile, sizeFile, ageFile);
  }

  public Dog[] createDog(String breedsFile, String sizeFile, String ageFile){
    String[] breeds = FileReader.toStringArray(breedsFile);
    String[] size = FileReader.toStringArray(sizeFile);
    Dog[] placeHolder = new Dog[breeds.length];

    int[] age = FileReader.toIntArray(ageFile);

    for(int i = 0; i < placeHolder.length; i++){
      placeHolder[i] = new Dog(breeds[i], size[i], age[i]);
    }
    return placeHolder;
  }
  
public Dog getMostPopular(){
  int count = 0;
  for(int i = 0; i < dogs.length; i++){
    if(dogs[i].getBreed().equals("Labrador") && dogs[i].getSize().equals("Medium")){
      count++;
    }
  }
  int[] dogIndexes = new int[count];
  int index = 0;
  for(int i = 0; i < dogs.length; i++){
    if(dogs[i].getBreed().equals("Labrador") && dogs[i].getSize().equals("Medium")){
      dogIndexes[index] = i;
      index++;
    }
  }
  Dog youngestDog = findYoungestDog(dogIndexes);
  return youngestDog;
}

  public Dog findYoungestDog(int[] dogIndexes) {
    // 1. Make a variables for the smallest age, and set equals to the dog at index 0 of dogIndexes
    Dog youngestDog = dogs[dogIndexes[0]];
    System.out.println(dogIndexes[0]);
    // 2. Traverse the dogs array
for(int i = 0; i < dogs.length; i++){
    // 3. Check to see if the dog's age (dogs[i].getAge()) smallers that the variable from step 1
  if(dogs[i].getAge() < youngestDog.getAge()) {
    // 4. If true, set the variables from step 1 to be this dog
youngestDog = dogs[i];
  }
  }
    // 5. Return the variables from step 1
  return youngestDog;
  }
  public String toString(){
    return "";
  }
// private String[] breeds;
// private String[] size;
// private int[] age;
  
// // Scanner fileReader = new Scanner(breeds);
//   //Parameterized constructor
// public UserStory(String breedFile, String sizeFile, int ageFile){
//   String[] breeds = FileReader.toStringArray(breedFile);
//   String[] size = FileReader.toStringArray(sizeFile);
//   int[] age = FileReader.toIntArray(ageFile);
// }

  


// //toString return method
// public String toString(){
//   return "This dog is a: " + size + " " + breeds + " and is " + age + " months old.";
// }
  
}