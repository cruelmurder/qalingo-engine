/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.web.mvc.viewbean;

public class StoreTagViewBean extends AbstractViewBean {

	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = -5387549493050575454L;
	
	protected String code;
	protected String name;
	protected String description;
	protected String detailsUrl;
	
	public String getCode() {
    	return code;
    }

	public void setCode(String code) {
    	this.code = code;
    }

	public String getName() {
    	return name;
    }

	public void setName(String name) {
    	this.name = name;
    }

	public String getDescription() {
    	return description;
    }

	public void setDescription(String description) {
    	this.description = description;
    }
	
	public String getDetailsUrl() {
        return detailsUrl;
    }
	
	public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

}