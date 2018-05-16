package ee.ttu.tarkvaratehnika.selveleidja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@SpringBootApplication
public class SelveleidjaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SelveleidjaApplication.class, args);

		try
		{
			// create a mysql database connection
			String myDriver = "org.mariadb.jdbc.Driver";
			String myUrl = "jdbc:mysql://localhost/selveleidja";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "root");

			// the mysql insert statement
			String query = " insert into pesulad_info (id, address, hind, name)"
					+ " values (?, ?, ?, ?)";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);
			preparedStmt.setString (2, "Paldiski mnt 98a");
			preparedStmt.setString   (3, "0,5€ = 30-50 sekundit");
			preparedStmt.setString (4, "Jazz Selvepesula");

			PreparedStatement preparedStmt1 = conn.prepareStatement(query);
			preparedStmt1.setInt (1, 2);
			preparedStmt1.setString (2, "Tammsaare tee 55");
			preparedStmt1.setString   (3, "1€ = 100 sekundit");
			preparedStmt1.setString (4, "Mündipesula");

			PreparedStatement preparedStmt2 = conn.prepareStatement(query);
			preparedStmt2.setInt (1, 3);
			preparedStmt2.setString (2, "Linnamäe tee 37b");
			preparedStmt2.setString   (3, "0,5€ = ~50 sekundit");
			preparedStmt2.setString (4, "SmartWash");

			PreparedStatement preparedStmt3 = conn.prepareStatement(query);
			preparedStmt3.setInt (1, 4);
			preparedStmt3.setString (2, "Tallinn");
			preparedStmt3.setString   (3, "0,5€ = ~50 sekundit");
			preparedStmt3.setString (4, "NB Carwash");

			PreparedStatement preparedStmt4 = conn.prepareStatement(query);
			preparedStmt4.setInt (1, 5);
			preparedStmt4.setString (2, "Tondiraba 11");
			preparedStmt4.setString   (3, "1€ = ~100 sekundit");
			preparedStmt4.setString (4, "Nutipesu");

			PreparedStatement preparedStmt5 = conn.prepareStatement(query);
			preparedStmt5.setInt (1, 6);
			preparedStmt5.setString (2, "Laagna tee 12");
			preparedStmt5.setString   (3, "1€ = ~60 sekundit");
			preparedStmt5.setString (4, "Isepesula 24");

			PreparedStatement preparedStmt6 = conn.prepareStatement(query);
			preparedStmt6.setInt (1, 7);
			preparedStmt6.setString (2, "Järveotsa tee 20");
			preparedStmt6.setString   (3, "1€ = ~90 sekundit");
			preparedStmt6.setString (4, "Aqua pesulad");

			PreparedStatement preparedStmt7 = conn.prepareStatement(query);
			preparedStmt7.setInt (1, 8);
			preparedStmt7.setString (2, "Pae 36");
			preparedStmt7.setString   (3, "0,5€ = ~50 sekundit");
			preparedStmt7.setString (4, "Wash24");

			PreparedStatement preparedStmt8 = conn.prepareStatement(query);
			preparedStmt8.setInt (1, 9);
			preparedStmt8.setString (2, "Veerenni 54");
			preparedStmt8.setString   (3, "0,5€ = ~50 sekundit");
			preparedStmt8.setString (4, "Linnapesulad");

			PreparedStatement preparedStmt9 = conn.prepareStatement(query);
			preparedStmt9.setInt (1, 10);
			preparedStmt9.setString (2, "Laagri, Tallinn");
			preparedStmt9.setString   (3, "1€ = ~100 sekundit");
			preparedStmt9.setString (4, "Pese ise");

			PreparedStatement preparedStmt10 = conn.prepareStatement(query);
			preparedStmt10.setInt (1, 11);
			preparedStmt10.setString (2, "Kadaka tee 1");
			preparedStmt10.setString   (3, "1€ = ~100 sekundit");
			preparedStmt10.setString (4, "EHRLE Autopesula");

			// execute the preparedstatement
			preparedStmt.execute();
			preparedStmt1.execute();
			preparedStmt2.execute();
			preparedStmt3.execute();
			preparedStmt4.execute();
			preparedStmt5.execute();
			preparedStmt6.execute();
			preparedStmt7.execute();
			preparedStmt8.execute();
			preparedStmt9.execute();
			preparedStmt10.execute();

			conn.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
	}

	@Bean
    public CorsFilter corsFilter() {
		        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		        CorsConfiguration config = new CorsConfiguration();
		        config.setAllowCredentials(true);
		        config.addAllowedOrigin("*");
		        config.addAllowedHeader("*");
		        config.addAllowedMethod("GET");
		        config.addAllowedMethod("POST");
		        config.addAllowedMethod("PUT");
		        config.addAllowedMethod("DELETE");
		        config.addAllowedMethod("OPTIONS");
		        source.registerCorsConfiguration("/**", config);
		        return new CorsFilter(source);
		    }
}

