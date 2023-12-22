package davis.tech;

public class Test {
	public static void main(String[] args) {
SinglyLinkedList<String> students = new SinglyLinkedList<>();
		
		students.addFirst("SSEREMBA");
		students.addLast("CYPRIAN");
		students.addLast("DAVIS");
		System.out.println(students.getFirst());
		System.out.println();
		
		SinglyLinkedList<String> studentList = new SinglyLinkedList<>();
		
		studentList.addFirst("SSEREMBA");
		studentList.addLast("CYPRIAN");
		studentList.addLast("DAVIS");
		
		System.out.println(students.getLast());
		System.out.println();
		System.out.println(students.equals(studentList));
		
		
	}

}
