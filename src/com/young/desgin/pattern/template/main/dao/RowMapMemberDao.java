package com.young.desgin.pattern.template.main.dao;

import com.young.desgin.pattern.template.main.JdbcTemplate;
import com.young.desgin.pattern.template.main.RowMapJdbcTemplate;
import com.young.desgin.pattern.template.main.RowMapper;
import com.young.desgin.pattern.template.main.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class RowMapMemberDao {
   private RowMapJdbcTemplate template=new RowMapJdbcTemplate(null);

    public List<?> query(){
        return template.executeQuery("select * from user", new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member=new Member();
                member.setAddr(rs.getString("addr"));
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
                member.setNick(rs.getString("nick"));
                member.setPassword(rs.getString("password"));
                return member;
            }
        },null);
    }


}
