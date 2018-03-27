package com.young.desgin.pattern.template.main;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public  class RowMapJdbcTemplate {
    private DataSource dataSource;

    public RowMapJdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
    private PreparedStatement createPreparedStatement(Connection conn,String sql) throws  Exception{
        return conn.prepareStatement(sql);
    }
    private ResultSet executeQuery(PreparedStatement pst,Object[] values) throws Exception {
            for(int i=0;i<values.length;i++){
                pst.setObject(i,values[i]);
            }
            return pst.executeQuery();
    }
    private void closeResult(ResultSet ret){
        try {
            ret.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closePreparedStatement(PreparedStatement pst){
        try {
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closeConnection(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private List<?> parseResultSet(ResultSet rs,RowMapper rowMapper) throws  Exception{
        List<Object> result=new ArrayList<Object>();
        int rowNum=0;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    public  List<?> executeQuery(String sql,RowMapper<?> rowMapper, Object[] vlaues ){
        try {
            //1.获取连接
            Connection conn=this.getConnection();
            //2.创建语句集
            PreparedStatement pstmt=this.createPreparedStatement(conn,sql);
            //3.执行语句集，并且获得结果
//            pstmt.set
            ResultSet rst=this.executeQuery(pstmt,vlaues);
            //4.解析语句集
            List<?> result=this.parseResultSet(rst,rowMapper);

            //5.关闭结果集
            this.closeResult(rst);
            //6.关闭语句集
            this.closePreparedStatement(pstmt);
            //7.关闭连接
            this.closeConnection(conn);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
