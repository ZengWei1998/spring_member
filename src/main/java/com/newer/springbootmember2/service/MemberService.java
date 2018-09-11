package com.newer.springbootmember2.service;

import com.newer.springbootmember2.mapper.MemberMapper;
import com.newer.springbootmember2.pojo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    /**
     * 模糊查询
     * @param mName
     * @param mCardNo
     * @return
     */
    public List<Member> findMemberParam(String mName , String mCardNo){
        return memberMapper.findMemberParam(mName,mCardNo);
    }

    /**
     * 新增
     * @param member
     * @return
     */
    public int add(Member member){
        return memberMapper.add(member);
    }

    /**
     * 根据id删除
     * @param mId
     * @return
     */
    public int delete(Integer mId){
        return memberMapper.delete(mId);
    }

    /**
     * 修改
     * @param member
     * @return
     */
    public int update(Member member){
        return memberMapper.update(member);
    }
}
