package com.newer.springbootmember2.mapper;

import com.newer.springbootmember2.pojo.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MemberMapper {


    List<Member> findMemberParam(
            @Param("mName") String mName,
            @Param("mCardNo") String mCardNo);

    @Select("select *from t_member where m_id = #{mId}")
    List<Member> findByIdMember();
    @Insert("insert into t_member(m_name,m_phone,m_level,m_card_no,m_in_time) values(#{mName},#{mPhone},#{mLevel},#{mCardNo},#{mInTime})")
    int add(Member member);
    @Delete("delete from t_member where m_id = #{mId}")
    int delete(Integer mID);
    @Update("update t_member set m_name=#{mName},m_level=#{mLevel},m_card_no=#{mCardNo},m_in_time=#{mInTime} where m_id=#{mId}")
    int update(Member member);
}

