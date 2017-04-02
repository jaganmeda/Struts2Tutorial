package com.jmeda.action;

import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LocaleAction extends ActionSupport implements SessionAware {
	
	private static Logger log = Logger.getLogger("com.cts.action.LocaleAction");

	/**
	 * 
	 */
	private static final long serialVersionUID = 18534678L;

	  Map<String, Object> session;

	    @Override
	    public String execute(){
	    	ActionContext context = ActionContext.getContext();
	    	System.out.println("Locale: " + context.LOCALE);
	    	log.debug("Locale: " + context.LOCALE + ", Language : " + context.getLocale().getLanguage());
	        //session.put("WW_TRANS_I18N_LOCALE", "fr");
	    	session.put("language", context.getLocale().getLanguage());
	        return SUCCESS;
	    }

	    @Override
	    public void setSession(Map<String, Object> session) {
	        this.session = session;
			Set<String> sessionKeys = session.keySet(); 
			for(String sessionKey : sessionKeys)	{
				System.out.println("Key :" + sessionKey + ", value : " + session.get(sessionKey));
			}

	    }

}
