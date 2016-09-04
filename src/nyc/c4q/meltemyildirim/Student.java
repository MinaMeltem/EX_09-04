package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 9/4/16.
 */
public class Student {
  private String firstName;
  private String lastName;
  private int idNumber;
  private String favoriteFood;

  public Student () { //default constructor

  }

  public static boolean checkSameFavoriteFood(Student student1, Student student2){
    return student1.getfavFood().equalsIgnoreCase(student2.getfavFood());
  }

  public String getfName(){
    return firstName;
  }

  public void setfName(String fName){
    firstName = fName;
  }
  public String getlName(){
    return lastName;
  }

  public void setlName(String lName){
    lastName = lName;
  }
  public int getidNum(){
    return idNumber;
  }

  public void setidNum(int idNum){
    idNumber = idNum;
  }

  public String getfavFood(){
    return favoriteFood;
  }

  public void setfavFood(String favFood){
    favoriteFood = favFood;
  }



}

