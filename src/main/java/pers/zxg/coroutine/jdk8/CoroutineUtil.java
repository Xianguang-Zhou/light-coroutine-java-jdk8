/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.jdk8;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

import pers.zxg.coroutine.Coroutine.Callable;
import pers.zxg.coroutine.Coroutine.OutsideCall;
import pers.zxg.coroutine.Coroutine.Runnable;
import pers.zxg.coroutine.Coroutine.Suspend;
import pers.zxg.coroutine.Coroutine.Weaver.NotWeaved;

/**
 * @author <a href="mailto:xianguang.zhou@outlook.com">Xianguang Zhou</a>
 */
public class CoroutineUtil extends pers.zxg.coroutine.CoroutineUtil {

	public static <T> T await(CompletionStage<T> stage) throws Suspend, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public static java.util.concurrent.Future<Void> run(Runnable runnable) {
		throw new NotWeaved();
	}

	public static <T> java.util.concurrent.Future<T> run(Callable<T> callable) {
		throw new NotWeaved();
	}
}
