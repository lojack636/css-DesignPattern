package com.css.other.filter11;

/**
 * 过滤处理实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ConcreteHandler2 extends AbstractHandler {
	
	@Override
	public String htmlFilter(String str) {
		return str.replace('<', '[').replace('>', ']');
	}

	@Override
	public String sensitiveFilter(String str) {
		return str.replace("敏感词1", "好词1").replace("敏感词3", "好词3");
	}
}
