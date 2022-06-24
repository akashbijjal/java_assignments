package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class problem4 {
public static void main(String[] args) {
	Path path=Path.of("D:\\Java11Assignments_StudentList.txt");

//	try {
//		List<String> data=Files.readAllLines(Path.of(path));
//		System.out.println(data);
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//	}
	
	try {
		Files.lines(path).filter(s->s.length()!=0).forEach(System.out::println);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
}
}
