package com.test.sharding.config;

import com.google.common.collect.Sets;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.Collection;

public class DataBaseHintAlgorithm implements HintShardingAlgorithm<Long> {

	@Override
	public Collection<String> doSharding(Collection<String> availableTargetNames,
										 HintShardingValue<Long> shardingValue) {
		Collection<String> databaseSet = Sets.newConcurrentHashSet();
		Collection<Long> userIds = shardingValue.getValues();
		for (Long userId : userIds) {
			if (userId % 2 == 0) {
				databaseSet.add("db1");
			} else {
				databaseSet.add("db0");
			}
		}
		//TODO 根据传进来的分片值 路由到对应的物理库
		return databaseSet;
	}

}
