package lesson01;

public class DataTypesPrimitives {
    public static void main(String[] args) {
        int age =25;
        char first_letter='S';
        double average=105.24;
        boolean is_female=false;
      String date="31/12/1955";
      String[] array=date.split("1");
        System.out.println("date:"+array[0]);
        System.out.println("date:"+array[1]);
        System.out.println("date:"+array[2]);
        System.out.println("date:"+array[3]);



        System.out.println("Age:"+age);
        System.out.println("First Letter:"+first_letter);
        System.out.println("Average:"+average);
        System.out.println("Female:"+is_female);

    }
}
