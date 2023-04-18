package chap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLDB {

    Connection con;
    Statement stmt;
    ResultSet rs;

    public Connection connect() {
        String url = "jdbc:mysql://localhost/studentdb";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("con = " + con);
            return con;
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
            System.err.println("ติดต่อฐานข้อมูลไม่ได้ครับ");
            return null;
        }
    }

    public ArrayList<Student> selectQuery(String sql) {
        Student std;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            ArrayList<Student> studentList = new ArrayList<>();
            while (rs.next()) {
                std = new Student();
                std.setId(rs.getString(1));
                std.setName(rs.getString(2));
                std.setSurname(rs.getString(3));
                studentList.add(std);
//                System.out.println("ID : " + rs.getString(1));
//                System.out.println("Name : " + rs.getString(2));
//                System.out.println("Surname : " + rs.getString(3));
            }
            return studentList;
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
            System.err.println("ดึงข้อมูลไม่ได้ครับ");
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }

    }

    public int CUD(String sql) {//create update delete
        int row = 0;
        try {
            con = connect();
            stmt = con.createStatement();
            row = stmt.executeUpdate(sql);
            return row;
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
            System.err.println("CUD ไม่ได้ครับ");
            return row;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }

        }
    }

    public static void main(String[] args) {
        MySQLDB myDB = new MySQLDB();
//        myDB.selectQuery("SELECT*FROM STUDENT");
//        myDB.CUD("INSERT INTO STUDENT VALUES ('1007','panuwat','jantong')");
          myDB.CUD("DELETE FROM student WHERE Student_ID ='644295057'");
    }

}//end
