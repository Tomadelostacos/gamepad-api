package com.gamepad.api.dao;

import com.gamepad.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcInsert simpleJdbcInsert;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("User");
    }

    public void save(User user) {
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("name", user.getFirstName());

        simpleJdbcInsert.execute(params);
    }

    public User getById(long id) {
        // ...
        return new User();
    }

    public int getUserCount() {
        return jdbcTemplate.queryForObject("SELECT count(1) FROM User", Integer.class);
    }

}
