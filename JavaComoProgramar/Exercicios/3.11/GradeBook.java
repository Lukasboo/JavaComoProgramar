public class GradeBook {
		
		private String courseName;
		private String teacherName;

		public GradeBook(String name, String teacherName) {
			courseName = name;
			this.teacherName = teacherName;
		}

		public void setCourseName(String name) {
			courseName = name;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}

		public String getTeacherName() {
			return teacherName;
		}

		public void displayMessage() {
			System.out.printf("Bem vindo ao Livro de Notas para " + getCourseName() + "\nEste curso é apresentado por " + getTeacherName() + "\n");
		} 



}
