public class practice1 {
    public static void main(String[] args){
        Student A = new Student();
        Student B = new Student();
        Student C = new Student();

        
        A.height = 1.7f;
        A.weight = 70.0f;
        B.height = 1.8f;
        B.weight = 70.0f;
        C.height = 1.7f;
        C.weight = 80.0f;

        
        System.out.println(A.BMI());
        System.out.println(B.BMI());
        System.out.println(C.BMI());
        System.out.println(Student.STUDENT_NUMS);

    }  
}
