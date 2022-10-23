package BookStoreAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class BookStoreApiApplication {

	public static void main(String[] args) {


		SpringApplication.run(BookStoreApiApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(BookRepository repository) {
		DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma 'ET'");
		ZonedDateTime currentISTime = ZonedDateTime.now();
		ZonedDateTime currentETime = currentISTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		return args -> {
			BookDescriptions book1 = new BookDescriptions("LOTR", "Concerning Orcs", etFormat.format(currentETime));
			repository.insert(book1);

			BookDescriptions book2 = new BookDescriptions("Goldeneye", "Sean Connory at his Finest", etFormat.format(currentETime));
			repository.insert(book2);

			BookDescriptions book3 = new BookDescriptions("A Farewell to Arms", "Romance and War", etFormat.format(currentETime));
			repository.insert(book3);
		};

	}
}
