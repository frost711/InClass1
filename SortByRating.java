import java.util.Comparator;

public class SortByRating implements Comparator<Student> {

	@Override
	public int compare(Student firstStudent, Student secondStudent) {
		return firstStudent.getRating() - secondStudent.getRating();
	}

}
