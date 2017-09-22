package com.idiot;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DateInsert {
    private static String dbClassName = "com.mysql.jdbc.Driver";
    private static String dbUrl = "jdbc:mysql://localhost:3306/test";
    private static String dbUser = "root";
    private static String dbPwd = "guoweijie";
    private static Connection conn = null;
    private static String[] col1Values = { "Mike", "Bob", "Jack", "Alice",
            "Cathy", "Ann", "Betty", "Cindy", "Mary", "Jane" };
    private static String[] col2Values = new String[3125];
    private static int point;
    public static void main(String args[]) {
        insertData();
//		query1();
//		clearData();
    }
    public static void insertData() {
        try {
            conn.setAutoCommit(false);
            StringBuffer sqlBuffer = new StringBuffer(
                    "insert into test (col1,col2,col3) values");
            sqlBuffer.append("(?,?,?)");
            for (int j = 2; j <= 10000; j++) {
                sqlBuffer.append(",(?,?,?)");
            }
            sqlBuffer.append(";");
            String sql = new String(sqlBuffer);
            PreparedStatement pst = conn.prepareStatement(sql);
            System.out.println("start insert data");
            Long beginTime = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 10000; j++) {
                    pst.setString(3 * j + 1,
                            col1Values[(int) (Math.random() * 10)]);
                    pst.setString(3 * j + 2,
                            col2Values[(int) (Math.random() * 3125)]);
                    pst.setInt(3 * j + 3, (int) (Math.random() * 20) + 1);
                }
                pst.execute();
            }
            conn.commit();
            pst.close();
            Long endTime = System.currentTimeMillis();
            System.out.println("end insert data");
            System.out.println("insert time: " + (double) (endTime - beginTime)
                    / 1000 + " s");
            System.out.println();
        } catch (SQLException ce) {
            System.out.println(ce);
        }
    }
    public static void query1() {
        try {
            System.out.println("start query1: 'select count(*) from test group by col1 order by count(*);'");
            Long beginTime = System.currentTimeMillis();
            Statement st = conn.createStatement();
            String sql = "select count(*) from test group by col1 order by count(*);";
            ResultSet rs = st.executeQuery(sql);
            Long endTime = System.currentTimeMillis();
            System.out.println("result:");
            while (rs.next()) {
                System.out.println(rs.getInt(1));
            }
            System.out.println("query1 time: " + (double) (endTime - beginTime)
                    / 1000 + " s");
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void clearData() {
        try {
            System.out.println("start delete all data");
            Long beginTime = System.currentTimeMillis();
            Statement st = conn.createStatement();
            String sql = "delete from test";
            st.execute(sql);
            st.close();
            conn.close();
            Long endTime = System.currentTimeMillis();
            System.out.println("end delete all data");
            System.out.println("delete time: " + (double) (endTime - beginTime)
                    / 1000 + " s");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static {
        try {
            Class.forName(dbClassName).newInstance();
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        point = 0;
        initCol2Value(5, new StringBuffer(""));
    }
    private static void initCol2Value(int n, StringBuffer str) {
        if (n == 0) {
            col2Values[point++] = new String(str);
            return;
        }
        for (int i = 0; i < 5; i++) {
            StringBuffer strTemp = new StringBuffer(str);
            initCol2Value(n - 1, strTemp.append((char) ('a' + i)));
        }
    }
}

