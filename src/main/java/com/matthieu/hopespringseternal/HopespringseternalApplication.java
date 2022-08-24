package com.matthieu.hopespringseternal;

import com.matthieu.hopespringseternal.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class HopespringseternalApplication {

	public static void main(String[] args) {

		SpringApplication.run(HopespringseternalApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Gregor",
						"joseph.kay@hotmail.com",
						LocalDate.of(2000, Month.JANUARY, 11),
						21
				)
		);
	}
}
