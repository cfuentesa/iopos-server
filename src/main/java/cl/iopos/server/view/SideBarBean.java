package cl.iopos.server.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name="sideBarBean")
@SessionScoped
public class SideBarBean implements Serializable {

	private static final long serialVersionUID = 8334926064196966901L;
	final Logger logger = LoggerFactory.getLogger(getClass());

	public void productSetup(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		//return "actionProductSetup";
	}

}
