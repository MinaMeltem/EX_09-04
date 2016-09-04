package nyc.c4q.meltemyildirim;

public class Main {

    public static void main(String[] args) {

        Student Mel = new Student();
        Student Mona =  new Student();

        Mel.getfavFood();
        Mel.setfavFood("Sushi");

        Mona.getfavFood();
        Mona.setfavFood("Sushi");

        System.out.println(Student.checkSameFavoriteFood(Mel,Mona));




    }
}
