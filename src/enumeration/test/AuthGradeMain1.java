package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade=" + value.name());
            System.out.println("level=" + value.getLevel());
            System.out.println("description=" + value.getDescription());
        }
    }
}
