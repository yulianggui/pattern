package pattern.template;

import java.sql.ResultSet;

/**
 * create by zhegui on 2018/10/5
 */
public interface RowMapper<T> {

    public T mapRow(ResultSet rs, int rowNum) throws Exception;
}
