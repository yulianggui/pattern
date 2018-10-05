package pattern.template.dto;

import pattern.template.JdbcTemplate;
import pattern.template.RowMapper;
import pattern.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * create by zhegui on 2018/10/5
 */
public class MemberDao{

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<Member> query(){
        String sql = "select * from t_member";
        return jdbcTemplate.executeQuery(sql,new RowMapper<Member>(){

            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUserName(rs.getString("userName"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }

}
