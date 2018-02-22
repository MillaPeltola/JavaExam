import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kyselija {
    String sql = "select * from questions";
    ArrayList<Olio> lista = new ArrayList();


    public void kysy(Connection con) {
        Scanner sc = new Scanner(System.in);
        int pisteet = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Olio o = new Olio();
                o.setId(rs.getInt("id"));
                o.setKysymys(rs.getString("kysymys"));
                o.setV1(rs.getString("v1"));
                o.setV2(rs.getString("v2"));
                o.setV3(rs.getString("v3"));
                o.setV4(rs.getString("v4"));
                o.setVastaus(rs.getString("vastaus"));
                lista.add(o);
            }
            for (Olio o : lista) {
                System.out.println(o);
                String s = sc.nextLine();
                if (s.equalsIgnoreCase(o.getVastaus())) {
                    System.out.println('\n' + "True");
                    pisteet ++;
                } else {
                    System.out.println('\n' + "False. The right answer is " + o.getVastaus());
                }
                sc.nextLine();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Score " + pisteet + "/7");
    }

}

