package Group8.BookStoreAPI;

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
			BookDescriptions book2 = new BookDescriptions("Matthew", "This a test!!!!", etFormat.format(currentETime));
			repository.insert(book2);
		};

	}
}
