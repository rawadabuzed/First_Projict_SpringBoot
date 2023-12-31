package com.example.First_Projict_SpringBoot.reposiroty.mapper;


import com.example.First_Projict_SpringBoot.model.UserPoll;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserPollMapper implements RowMapper<UserPoll> {
    @Override
   public UserPoll mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new UserPoll(
                rs.getInt("id"),
                rs.getInt("user_id"),
                rs.getInt("poll_id"),
                rs.getString("answers")

        );
    }

}
