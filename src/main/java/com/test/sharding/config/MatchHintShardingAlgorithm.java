package com.test.sharding.config;

import com.google.common.collect.Sets;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;


import java.util.Collection;

public class MatchHintShardingAlgorithm implements HintShardingAlgorithm<Long> {
    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final HintShardingValue<Long> shardingValue) {
        Collection<String> tableSet = Sets.newConcurrentHashSet();
        Collection<Long> orderIds = shardingValue.getValues();
        for (Long orderId : orderIds) {
            if (orderId % 2 == 0) {
                tableSet.add("t_order1");
            } else {
                tableSet.add("t_order0");
            }
        }
        //TODO 根据传进来的分片值 路由到对应的物理表
        return tableSet;
    }
}