public class StudentTest{

	public static void main(String[] args){

		Student student1 = new Student("Jane Blue", 83.5);
		Student student2 = new Student("John Green", 72.5);

		System.out.printf("%s grade letter is %s", student1.getName(), student1.getLetterGrade());
		System.out.printf("%s grade letter is %s", student2.getName(), student2.getLetterGrade());
	}
}