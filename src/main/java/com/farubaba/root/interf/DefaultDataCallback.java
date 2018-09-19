package com.farubaba.root.interf;

import java.util.List;

/**
 * 父类，用于扩展类似AOP功能使用
 * @author violet
 *
 * @param <M>
 * @param <ERROR>
 */
public abstract class DefaultDataCallback<M, ERROR> implements IDataCallback<M, ERROR> {
	@Override
	public void onSuccess(List<M> result) {
		
	}
	
	@Override
	public void onSuccess(M result) {
		
	}
	
	@Override
	public void onFailure(ERROR error) {
		
	}
}
