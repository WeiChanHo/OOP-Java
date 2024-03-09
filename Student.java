public class Student {
    public static int STUDENT_NUMS;
    public static int numbers(int STUDENT_NUMS){
        return STUDENT_NUMS++;
    }

    public float weight;
    public float height;

    public float BMI(){
        return weight/(height*height);
    }

    Student(){
        System.out.println("Student created");
        STUDENT_NUMS = numbers(STUDENT_NUMS);
    }
}
