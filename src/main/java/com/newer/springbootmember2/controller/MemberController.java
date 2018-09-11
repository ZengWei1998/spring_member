package com.newer.springbootmember2.controller;

import com.newer.springbootmember2.pojo.Member;
import com.newer.springbootmember2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "member",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Member>> find(
            @RequestParam(value = "mName" ,required = false) String mName,
            @RequestParam(value = "mCardNo" ,required = false) String mCardNo
    ){
        List<Member> members = memberService.findMemberParam(mName,mCardNo);
        if (members.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(members,HttpStatus.OK);

    }

    @RequestMapping(value = "member" , method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> add(@RequestBody Member member){
        return new ResponseEntity<>(memberService.add(member),HttpStatus.OK);
    }

    @RequestMapping(value = "member/{mId}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> remove(@PathVariable("mId") Integer mId){
        return new ResponseEntity<>(memberService.delete(mId),HttpStatus.OK);
    }

    @RequestMapping(value = "member",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> modify(@RequestBody Member member){
        return new ResponseEntity<>(memberService.update(member),HttpStatus.OK);
    }
}
