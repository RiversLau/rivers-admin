package com.zhaoxiang.auth;

import com.zhaoxiang.service.AdminService;
import com.zhaoxiang.vo.AdminVO;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: RiversLau
 * Date: 2017/8/17 15:10
 */
public class AdminShiroRealm extends AuthorizingRealm {

    private static final String REAL_NAME = "AdminShiroRealm";

    @Autowired
    private AdminService adminService;

    public AdminShiroRealm(CredentialsMatcher matcher) {
        super(matcher);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;

        String username = usernamePasswordToken.getUsername();

        AdminVO adminUser = adminService.getEnabledUserByUsername(username);
        if (adminUser == null) {
            throw new UnknownAccountException("用户名或密码错误");
        }
        return new SimpleAuthenticationInfo(username, adminUser.getPassword(), REAL_NAME);
    }
}
