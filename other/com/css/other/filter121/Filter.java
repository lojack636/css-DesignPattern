package com.css.other.filter121;

/**
 * 抽象策略类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class Filter {
	public abstract String htmlFilter(String str);

	public abstract String sensitiveFilter(String str);

	public String doFilter(String str) {
		str = htmlFilter(str);
		str = sensitiveFilter(str);
		return str;
	}
}
