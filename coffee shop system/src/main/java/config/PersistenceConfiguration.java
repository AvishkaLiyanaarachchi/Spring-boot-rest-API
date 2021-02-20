package config;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
   
	@Bean
	public DataSource datasource() {
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url("jdbc:mysql://localhost:3308/coffee_shop_db");
		System.out.println("The datasource");
		return builder.build();
	}
}
