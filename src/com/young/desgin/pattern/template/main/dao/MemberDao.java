package com.young.desgin.pattern.template.main.dao;

import com.young.desgin.pattern.template.main.JdbcTemplate;
import com.young.desgin.pattern.template.main.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public Object processResult(ResultSet rst,int rowNum) throws Exception {
        Member member=new Member();
        member.setName(rst.getString("name"));
        member.setAddr(rst.getString("addr"));
        member.setAge(rst.getInt("age"));
        member.setNick(rst.getString("nick"));
        member.setPassword(rst.getString("password"));
        return member;
    }

    public List<Object> query(){
       return super.executeQuery("select * from user ",null);
    }
}
