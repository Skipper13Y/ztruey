package com.hekaikai666.ztruey.mapper;

import com.hekaikai666.ztruey.Code.SqlCode;
import com.hekaikai666.ztruey.bean.Info;
import org.apache.ibatis.annotations.Select;

public interface InfoDao {
    @Select(SqlCode.queryByName)
    Info queryByName(String username);
}
