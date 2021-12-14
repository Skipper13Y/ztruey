package com.hekaikai666.ztruey.mapper;

import com.hekaikai666.ztruey.bean.UserPin;
import org.apache.ibatis.annotations.Param;

public interface UserPinMapper {
    UserPin selectUserPinInfoByUserId(@Param("userId") String userId);
}
