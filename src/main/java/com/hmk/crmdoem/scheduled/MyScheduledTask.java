package com.hmk.crmdoem.scheduled;

import com.hmk.crmdoem.entity.po.CstCustomer;
import com.hmk.crmdoem.entity.po.CstLevel;
import com.hmk.crmdoem.entity.po.CstService;
import com.hmk.crmdoem.entity.po.CstServiceType;
import com.hmk.crmdoem.entity.query.CstCustomerQuery;
import com.hmk.crmdoem.entity.query.CstLevelQuery;
import com.hmk.crmdoem.entity.query.CstServiceQuery;
import com.hmk.crmdoem.entity.query.CstServiceTypeQuery;
import com.hmk.crmdoem.mappers.CstCustomerMapper;
import com.hmk.crmdoem.mappers.CstLevelMapper;
import com.hmk.crmdoem.mappers.CstServiceMapper;
import com.hmk.crmdoem.mappers.CstServiceTypeMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class MyScheduledTask {

    @Resource
    CstLevelMapper<CstLevel, CstLevelQuery> cstLevelMapper;
    @Resource
    CstCustomerMapper<CstCustomer, CstCustomerQuery> customerMapper;
    @Resource
    CstServiceTypeMapper<CstServiceType, CstServiceTypeQuery> cstServiceTypeMapper;
    @Resource
    CstServiceMapper<CstService, CstServiceQuery> cstServiceMapper;
    @Scheduled(cron = "0 */1 * * * ?")
    public void checkLevelAmount() {
        List<CstLevel> cstLevels = cstLevelMapper.selectList(new CstLevelQuery());
        System.out.println(cstLevels);
        CstCustomerQuery cstCustomerQuery=new CstCustomerQuery();
        CstLevel cstLevelPojo=new CstLevel();
        for (CstLevel cstLevel : cstLevels) {
            cstCustomerQuery.setCustLevel(cstLevel.getCustLevel());
            Integer integer = customerMapper.selectCount(cstCustomerQuery);
            cstLevelPojo.setCustAmount(integer);
            cstLevelMapper.updateByCustLevelId(cstLevelPojo,cstLevel.getCustLevelId());
        }
    }
    @Scheduled(cron = "0 */1 * * * ?")
    public void checkServiceTypeAmount(){
        List<CstServiceType> cstServiceTypes = cstServiceTypeMapper.selectList(new CstServiceTypeQuery());
        CstServiceQuery cstServiceQuery=new CstServiceQuery();
        CstServiceType cstServiceTypePojo=new CstServiceType();
        for (CstServiceType cstServiceType : cstServiceTypes) {
            cstServiceQuery.setSvrType(cstServiceType.getCstServiceType());
            Integer integer = cstServiceMapper.selectCount(cstServiceQuery);
            cstServiceTypePojo.setCstAmount(integer.toString());
            cstServiceTypeMapper.updateByCstId(cstServiceTypePojo,cstServiceType.getCstId());
        }
    }
}
