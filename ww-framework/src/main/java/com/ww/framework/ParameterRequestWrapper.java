package com.ww.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;

/**
 * 参数格式化
 * @author Administrator
 *
 */
public class ParameterRequestWrapper extends HttpServletRequestWrapper {

	private final Map<String, Object> params;

	public ParameterRequestWrapper(HttpServletRequest request, Map<String, Object> newParams) {
		super(request);
		this.params = newParams;
	}

	@Override
	public Map<String, Object> getParameterMap() {
		return params;
	}

	@Override
	public Enumeration<String> getParameterNames() {
		Vector<String> l = new Vector<String>(params.keySet());
		return l.elements();
	}

	@Override
	public String[] getParameterValues(String name) {
		Object v = params.get(name);
		if (v == null) {
			return null;
		} else if (v instanceof String[]) {
			return (String[]) v;
		} else if (v instanceof String) {
			return new String[] { (String) v };
		} else {
			return new String[] { v.toString() };
		}
	}

	@Override
	public String getParameter(String name) {
		Object v = params.get(name);
		if (v == null) {
			return null;
		} else if (v instanceof String[]) {
			String[] strArr = (String[]) v;
			if (strArr.length > 0) {
				return strArr[0];
			} else {
				return null;
			}
		} else if (v instanceof String) {
			return (String) v;
		} else {
			return v.toString();
		}
	}

}