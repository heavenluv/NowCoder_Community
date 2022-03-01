package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param is used for parameters reference naming
    // If there is only one parameter, and used in <if>, we must add reference name
    int selectDiscussPostRows(@Param("userId") int userId);


}
