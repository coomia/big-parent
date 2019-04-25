package com.bosssoft.bigdata.daemon.quartz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bosssoft.bigdata.daemon.quartz.entity.SysJob;
import com.bosssoft.bigdata.daemon.quartz.mapper.SysJobMapper;
import com.bosssoft.bigdata.daemon.quartz.service.SysJobService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 定时任务调度表
 *
 * @author Lleyton J.
 * @date 2019-03-31
 */
@Slf4j
@Service
@AllArgsConstructor
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob> implements SysJobService {

}
