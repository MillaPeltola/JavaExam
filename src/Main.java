import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try (Connection con =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/kysymykset?useSSL=false",
                             "root", "Salasana2018")) {
           // Kysymys k = new Kysymys();
            //k.lueKysymykset(con);
            Kyselija mita = new Kyselija();
            mita.kysy(con);
        } catch (Exception e) {
            e.printStackTrace(); }
    }
}
