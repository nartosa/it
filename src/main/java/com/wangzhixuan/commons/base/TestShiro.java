package com.wangzhixuan.commons.base;

import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.mgt.DefaultSecurityManager;

public class TestShiro
{
	public static void main(String[] args)
	{
		DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
		ModularRealmAuthenticator authenticator = new ModularRealmAuthenticator();
		authenticator.setAuthenticationStrategy(new AtLeastOneSuccessfulStrategy());
		defaultSecurityManager.setAuthenticator(authenticator);

	}
}
