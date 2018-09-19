package com.farubaba.root.interf;

public interface ICallback<M, ERROR> {
	void onSuccess(M result);
	void onFailure(ERROR error);
}
