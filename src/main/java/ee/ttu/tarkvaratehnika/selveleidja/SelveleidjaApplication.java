package ee.ttu.tarkvaratehnika.selveleidja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
            String query = " insert into pesulad_info (id, name, address, hind)"
                    + " values (?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt    (1, 1);
            preparedStmt.setString (2, "Jazz Selvepesula");
            preparedStmt.setString (3, "Paldiski mnt 98a, Läänemere tee 2b");
            preparedStmt.setString (4, "0,5€ = 45-90 sekundit");

            PreparedStatement preparedStmt1 = conn.prepareStatement(query);
            preparedStmt1.setInt    (1, 2);
            preparedStmt1.setString (2, "Mündipesula");
            preparedStmt1.setString (3, "Tuulemaa 20, Paldiski maantee 96, A.H.Tammsaare tee 55, Kärberi 20, Linnamäe tee 40, Pärnamäe tee 4a");
            preparedStmt1.setString (4, "1€ = ~100 sekundit");

            PreparedStatement preparedStmt2 = conn.prepareStatement(query);
            preparedStmt2.setInt    (1, 3);
            preparedStmt2.setString (2, "SmartWash");
            preparedStmt2.setString (3, "Liimi 4a, Linnamäe tee 37b,");
            preparedStmt2.setString (4, "0,5€ = 50 sekundit");

            PreparedStatement preparedStmt3 = conn.prepareStatement(query);
            preparedStmt3.setInt    (1, 4);
            preparedStmt3.setString (2, "NB Autopesula");
            preparedStmt3.setString (3, "Vana-Lõuna 9, Sõle 25");
            preparedStmt3.setString (4, "0,5€ = ~50 sekundit");

            PreparedStatement preparedStmt4 = conn.prepareStatement(query);
            preparedStmt4.setInt    (1, 5);
            preparedStmt4.setString (2, "Kärcher Selvepesula");
            preparedStmt4.setString (3, "Peterburi tee 71b, Tondiraba 11");
            preparedStmt4.setString (4, "0,5€ = 50-70 sekundit");

            PreparedStatement preparedStmt5 = conn.prepareStatement(query);
            preparedStmt5.setInt    (1, 6);
            preparedStmt5.setString (2, "Isepesula 24");
            preparedStmt5.setString (3, "Laagna tee 12, Kadaka tee 3");
            preparedStmt5.setString (4, "0,5€ = 1 minut");

            PreparedStatement preparedStmt6 = conn.prepareStatement(query);
            preparedStmt6.setInt    (1, 7);
            preparedStmt6.setString (2, "Aqua Pesulad");
            preparedStmt6.setString (3, "Astangu 33; Vägeva tee 3a");
            preparedStmt6.setString (4, "0,5€ = ~75 sekundit");

            PreparedStatement preparedStmt7 = conn.prepareStatement(query);
            preparedStmt7.setInt    (1, 8);
            preparedStmt7.setString (2, "Wash24");
            preparedStmt7.setString (3, "Männiku tee 123, Pae 36");
            preparedStmt7.setString (4, "0,5€ = ~50 sekundit");

            PreparedStatement preparedStmt8 = conn.prepareStatement(query);
            preparedStmt8.setInt    (1, 9);
            preparedStmt8.setString (2, "Linnapesulad");
            preparedStmt8.setString (3, "Veerenni 54, Raadiku 8c");
            preparedStmt8.setString (4, "0,5€ = ~50 sekundit");

            PreparedStatement preparedStmt9 = conn.prepareStatement(query);
            preparedStmt9.setInt    (1, 10);
            preparedStmt9.setString (2, "Pese Ise");
            preparedStmt9.setString (3, " Pärnu mnt 558");
            preparedStmt9.setString (4, "1€ = 100 sekundit");

            PreparedStatement preparedStmt10 = conn.prepareStatement(query);
            preparedStmt10.setInt    (1, 11);
            preparedStmt10.setString (2, "EHRLE Autopesula");
            preparedStmt10.setString (3, "Kaeravälja 4");
            preparedStmt10.setString (4, "0,5€ = ~50 sekundit");

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
}
