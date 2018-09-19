package com.farubaba.root.interf;

import java.util.List;

/**
 * 
 * @author violet
 *
 * @param <M> 用在okhttp封装类中时，通常是实现接口{@link IModel}}实体类及其子类，但当用在其他地方时，也可以是任意其他类
 * @param <ERROR> 用在okhttp封装类中时，通常是{@link ErrorResult}}及其子类，但当用在其他地方时，也可以是其他任意类
 */
public interface IDataCallback<M,ERROR> extends ICallback<M, ERROR>{
	void onSuccess(List<M> result);
}
