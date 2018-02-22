import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Kysymys {

    public void lueKysymykset(Connection con) {
        String sql = "insert into questions (id, kysymys, v1, v2, v3, v4, vastaus) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,0 );
            ps.setString(2, "Given the code fragment:\n" +
                    "\n" +
                    " StringBuilder s1 = new StringBuilder(\"Java\");\n" +
                    " String s2 = \"Love\";\n" +
                    " s1.append(s2);\n" +
                    " s1.substring(4);\n" +
                    " int foundAt = s1.indexOf(s2);\n" +
                    "System.out.println(foundAt);\n" +
                    "\n" +
                    "What is the result?");
            ps.setString(3, "A) -1");
            ps.setString(4, "B) 3");
            ps.setString(5, "C) 4");
            ps.setString(6, "D) A StringIndexOutOfBoundsException is thrown at runtime.");
            ps.setString(7, "C");
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
