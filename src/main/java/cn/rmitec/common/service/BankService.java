package cn.rmitec.common.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hundsun.exchange.enums.payment.common.EnumBank;
import com.hundsun.exchange.request.payment.common.BankTransRequest;
import com.hundsun.exchange.result.payment.common.BankResult;
import com.hundsun.exchange.service.payment.common.RemoteBankService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class BankService {
	
//	private static final Logger log = LoggerFactory.getLogger(BankService.class);
	
	@Autowired
	private RemoteBankService bankService;
	
	@Test
	public void test_19203() {
		BankTransRequest req = new BankTransRequest();
		req.setBankCode(EnumBank.INST_EBANK_0024.getBankNo());
		req.setTransCode("19");
		req.setTransDate(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		req.setTransTime(new SimpleDateFormat("HHmmss").format(new Date()));
		BankResult bankResult = bankService.doBankFundService(req);
//		if (bankResult.isSuccess()) {
//			log.info("19203:success");
//		}else {
//			log.info("19203:error info:" + bankResult.getBankMessage());
//		}
	}
}
