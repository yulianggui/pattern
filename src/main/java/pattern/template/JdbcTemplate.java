package pattern.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * create by zhegui on 2018/10/5
 */
public class JdbcTemplate {

    protected DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getConnection() throws Exception{
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws  Exception{
        return conn.prepareStatement(sql);
    }

    private ResultSet executeQuery(PreparedStatement pstmt, Object[] values) throws Exception{
        for(int i=0; i < values.length; i++){
            pstmt.setObject(i, values[i]);
        }
        return pstmt.executeQuery();
    }

    private void closeStatement(Statement stmt) throws Exception{
        if(stmt !=null){
            stmt.close();
        }
    }

    private void closeResult(ResultSet rs) throws Exception{
        if(null != rs){
            rs.close();
        }
    }

    private void closeConnection(Connection conn) throws Exception{
        //放入连接池中，回收
    }

    private <T> List<T> parseResultSet(ResultSet rs, RowMapper<T> rowMapper) throws Exception{
        List<T> result = new ArrayList<>();
            int rowNum = 1;
            while (rs.next()){
                result.add(rowMapper.mapRow(rs, rowNum ++));
            }
        return result;
    }

    public <T> List<T> executeQuery(String sql, RowMapper<T> rowMapper, Object[] values){

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            //1、获取连接
            conn = this.getConnection();
            //2、创建语句集
            pstmt = this.createPreparedStatement(conn, sql);
            //3、执行语句集、并且获得结果集
            rs = this.executeQuery(pstmt, values);
            //4、解析语句集
            List<T> result = this.parseResultSet(rs ,rowMapper);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try{
                this.closeResult(rs);
                this.closeStatement(pstmt);
                this.closeConnection(conn);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
