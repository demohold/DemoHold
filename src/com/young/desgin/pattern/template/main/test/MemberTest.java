package com.young.desgin.pattern.template.main.test;

import com.young.desgin.pattern.template.main.dao.MemberDao;
import com.young.desgin.pattern.template.main.dao.RowMapMemberDao;

public class MemberTest {
    public static void main(String[] args) {
        MemberDao memberDao=new MemberDao(null);
        memberDao.query();
        RowMapMemberDao dao=new RowMapMemberDao();
        dao.query();
    }
}
