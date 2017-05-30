package cl.iopos.server.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class SupplierListBean implements Serializable {

	private static final long serialVersionUID = -4606929712359433222L;

	final Logger logger = LoggerFactory.getLogger(getClass());

	@ManagedProperty(value="#{productService}")
	private ProductService productService;

	
}
