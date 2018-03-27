package com.young.desgin.pattern.template.main;

import java.sql.ResultSet;

public interface RowMapper<T> {
    T mapRow(ResultSet rs,int rowNum) throws  Exception;
}
