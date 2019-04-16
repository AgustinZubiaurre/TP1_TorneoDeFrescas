import java.sql.*;

public class JDBC {
    // nombre de la base de la database "ganadorestorneofrescas"

    //Columnas:
    //id INT autoincrement PK
    //nombre_ganador varchar
    //bebida_en_cuerpo int


    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/ganadortorneo";

    static final String USER = "root";
    static final String PASS = "";


    public void guardarGanador (Humano ganador, int bebidaEnCuerpo){
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.prepareStatement("INSERT INTO ganadorestorneofrescas(nombre_ganador, bebida_en_cuerpo)"
                    + "VALUES(?,?)");

¡           stmt.setString(1, ganador.getNombre());
            stmt.setInt(2, bebidaEnCuerpo);
            stmt.executeUpdate();


        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}