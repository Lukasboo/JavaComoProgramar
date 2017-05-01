public class GradeBookTest {
	public static void main(String[] args) {
		GradeBook gradeBook1 = new GradeBook("CS101 Introdução para Programação Java", "Professor 1");
		GradeBook gradeBook2 = new GradeBook("CS102 Strutura de Dados em Java", "Professor 2");

		gradeBook1.displayMessage();
		gradeBook2.displayMessage();				

		System.out.printf("O nome do curso gradeBook1 é: %s\n", gradeBook1.getCourseName());
		System.out.printf("O nome do professor é: %s\n", gradeBook1.getTeacherName());

		System.out.printf("O nome do curso gradeBook2 é: %s\n", gradeBook2.getCourseName());
		System.out.printf("O nome do professor é: %s\n", gradeBook2.getTeacherName());
	}
}