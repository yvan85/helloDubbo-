package com.zy.api.member;

import com.zy.api.bean.User;

public interface MemberService {

    public String getUser(Long userId);

    public User queryUserInfo(int userid) ;

    public User setUserInfo(User user) ;
}
